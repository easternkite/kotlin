/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.backend.common

import org.jetbrains.kotlin.backend.common.ir.Ir
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities
import org.jetbrains.kotlin.ir.IrBuiltIns
import org.jetbrains.kotlin.ir.IrElement
import org.jetbrains.kotlin.ir.declarations.*
import org.jetbrains.kotlin.ir.expressions.*
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol
import org.jetbrains.kotlin.ir.symbols.IrSymbol
import org.jetbrains.kotlin.ir.types.*
import org.jetbrains.kotlin.ir.util.isNullable
import org.jetbrains.kotlin.ir.util.render
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid
import org.jetbrains.kotlin.resolve.scopes.receivers.ExtensionReceiver

typealias ReportError = (element: IrElement, message: String) -> Unit

internal class CheckIrElementVisitor(
    val irBuiltIns: IrBuiltIns,
    val reportError: ReportError,
    val config: IrValidatorConfig
) : IrElementVisitorVoid {
    private val visitedElements = hashSetOf<IrElement>()

    override fun visitElement(element: IrElement) {
        if (config.checkTreeConsistency && !visitedElements.add(element)) {
            val renderString = if (element is IrTypeParameter) element.render() + " of " + element.parent.render() else element.render()
            reportError(element, "Duplicate IR node: $renderString")

            // The IR tree is completely messed up if it includes one element twice. It may not be a tree at all, there may be cycles.
            // Give up early to avoid stack overflow.
            throw DuplicateIrNodeError(element)
        }
    }

    private fun IrExpression.ensureTypesEqual(actualType: IrType, expectedType: IrType) {
        if (!config.checkTypes)
            return

        if (actualType != expectedType) {
            reportError(this, "unexpected type: expected ${expectedType.render()}, got ${actualType.render()}")
        }
    }

    private fun IrExpression.ensureNullable() {
        if (!config.checkTypes)
            return

        if (!type.isNullable())
            reportError(this, "expected a nullable type, got ${type.render()}")
    }

    private fun IrExpression.ensureTypeIs(expectedType: IrType) {
        ensureTypesEqual(type, expectedType)
    }

    private fun IrSymbol.ensureBound(expression: IrExpression) {
        if (!this.isBound && expression.type !is IrDynamicType) {
            reportError(expression, "Unbound symbol $this")
        }
    }

    private fun IrElement.checkFunction(function: IrFunction) {
        if (function is IrSimpleFunction && config.checkProperties) {
            val property = function.correspondingPropertySymbol?.owner
            if (property != null && property.getter != function && property.setter != function) {
                reportError(this, "Orphaned property getter/setter ${function.render()}")
            }
        }

        if (function.dispatchReceiverParameter?.type is IrDynamicType) {
            reportError(this, "Dispatch receivers with 'dynamic' type are not allowed")
        }
    }

    override fun visitConst(expression: IrConst) {
        super.visitConst(expression)

        @Suppress("UNUSED_VARIABLE")
        val naturalType = when (expression.kind) {
            IrConstKind.Null -> {
                expression.ensureNullable()
                return
            }
            IrConstKind.Boolean -> irBuiltIns.booleanType
            IrConstKind.Char -> irBuiltIns.charType
            IrConstKind.Byte -> irBuiltIns.byteType
            IrConstKind.Short -> irBuiltIns.shortType
            IrConstKind.Int -> irBuiltIns.intType
            IrConstKind.Long -> irBuiltIns.longType
            IrConstKind.String -> irBuiltIns.stringType
            IrConstKind.Float -> irBuiltIns.floatType
            IrConstKind.Double -> irBuiltIns.doubleType
        }

        /*
        TODO: This check used to have JS inline class helpers. Rewrite it in a common way.
        var type = expression.type
        while (true) {
            val inlinedClass = type.getInlinedClass() ?: break
            if (getInlineClassUnderlyingType(inlinedClass) == type)
                break
            type = getInlineClassUnderlyingType(inlinedClass)
        }
        expression.ensureTypesEqual(type, naturalType)
        */
    }

    override fun visitStringConcatenation(expression: IrStringConcatenation) {
        super.visitStringConcatenation(expression)

        expression.ensureTypeIs(irBuiltIns.stringType)
    }

    override fun visitGetObjectValue(expression: IrGetObjectValue) {
        super.visitGetObjectValue(expression)

        expression.ensureTypeIs(expression.symbol.createType(false, emptyList()))
    }

    // TODO: visitGetEnumValue

    override fun visitGetValue(expression: IrGetValue) {
        super.visitGetValue(expression)

        expression.ensureTypeIs(expression.symbol.owner.type)
    }

    override fun visitSetValue(expression: IrSetValue) {
        super.visitSetValue(expression)
        val declaration = expression.symbol.owner
        if (declaration is IrValueParameter && !declaration.isAssignable) {
            reportError(expression, "Assignment to value parameters not marked assignable")
        }
        expression.ensureTypeIs(irBuiltIns.unitType)
    }

    override fun visitGetField(expression: IrGetField) {
        super.visitGetField(expression)

        val fieldType = expression.symbol.owner.type
        // TODO: We don't have the proper type substitution yet, so skip generics for now.
        if (fieldType is IrSimpleType &&
            fieldType.classifier is IrClassSymbol &&
            fieldType.arguments.isEmpty()
        ) {
            expression.ensureTypeIs(fieldType)
        }
    }

    override fun visitSetField(expression: IrSetField) {
        super.visitSetField(expression)

        expression.ensureTypeIs(irBuiltIns.unitType)
    }

    override fun visitCall(expression: IrCall) {
        super.visitCall(expression)

        val function = expression.symbol.owner
        expression.checkFunction(function)

        // TODO: Why don't we check parameters as well?

        val returnType = expression.symbol.owner.returnType
        // TODO: We don't have the proper type substitution yet, so skip generics for now.
        if (returnType is IrSimpleType &&
            returnType.classifier is IrClassSymbol &&
            returnType.arguments.isEmpty()
        ) {
            expression.ensureTypeIs(returnType)
        }

        expression.superQualifierSymbol?.ensureBound(expression)
    }

    override fun visitDelegatingConstructorCall(expression: IrDelegatingConstructorCall) {
        super.visitDelegatingConstructorCall(expression)

        expression.ensureTypeIs(irBuiltIns.unitType)
    }

    override fun visitInstanceInitializerCall(expression: IrInstanceInitializerCall) {
        super.visitInstanceInitializerCall(expression)

        expression.ensureTypeIs(irBuiltIns.unitType)
        expression.classSymbol.ensureBound(expression)
    }

    override fun visitTypeOperator(expression: IrTypeOperatorCall) {
        super.visitTypeOperator(expression)

        val operator = expression.operator
        val typeOperand = expression.typeOperand

        val naturalType = when (operator) {
            IrTypeOperator.CAST,
            IrTypeOperator.IMPLICIT_CAST,
            IrTypeOperator.IMPLICIT_NOTNULL,
            IrTypeOperator.IMPLICIT_COERCION_TO_UNIT,
            IrTypeOperator.IMPLICIT_INTEGER_COERCION,
            IrTypeOperator.SAM_CONVERSION,
            IrTypeOperator.IMPLICIT_DYNAMIC_CAST,
            IrTypeOperator.REINTERPRET_CAST ->
                typeOperand

            IrTypeOperator.SAFE_CAST ->
                typeOperand.makeNullable()

            IrTypeOperator.INSTANCEOF, IrTypeOperator.NOT_INSTANCEOF ->
                irBuiltIns.booleanType
        }

        if (operator == IrTypeOperator.IMPLICIT_COERCION_TO_UNIT && !typeOperand.isUnit()) {
            reportError(expression, "typeOperand is ${typeOperand.render()}")
        }

        // TODO: check IMPLICIT_NOTNULL's argument type.

        expression.ensureTypeIs(naturalType)
    }

    override fun visitLoop(loop: IrLoop) {
        super.visitLoop(loop)

        loop.ensureTypeIs(irBuiltIns.unitType)
    }

    override fun visitBreakContinue(jump: IrBreakContinue) {
        super.visitBreakContinue(jump)

        jump.ensureTypeIs(irBuiltIns.nothingType)
    }

    override fun visitReturn(expression: IrReturn) {
        super.visitReturn(expression)

        expression.ensureTypeIs(irBuiltIns.nothingType)
        expression.returnTargetSymbol.ensureBound(expression)
    }

    override fun visitThrow(expression: IrThrow) {
        super.visitThrow(expression)

        expression.ensureTypeIs(irBuiltIns.nothingType)
    }

    override fun visitFunction(declaration: IrFunction) {
        super.visitFunction(declaration)
        declaration.checkFunction(declaration)

        for ((i, param) in declaration.valueParameters.withIndex()) {
            if (param.indexInOldValueParameters != i) {
                reportError(declaration, "Inconsistent index (old API) of value parameter ${param.indexInOldValueParameters} != $i")
            }
        }

        var lastKind: IrParameterKind? = null
        for ((i, param) in declaration.parameters.withIndex()) {
            if (param.indexInParameters != i) {
                reportError(declaration, "Inconsistent index (new API) of value parameter ${param.indexInParameters} != $i")
            }

            val kind = param.kind
            if (lastKind != null) {
                if (kind < lastKind) {
                    reportError(
                        declaration,
                        "Invalid order of function parameters: $kind is placed after $lastKind.\n" +
                                "Parameters must follow a strict order: " +
                                "[dispatch receiver, context parameters, extension receiver, regular parameters]."
                    )
                }

                if (kind == IrParameterKind.DispatchReceiver || kind == IrParameterKind.ExtensionReceiver) {
                    if (kind == lastKind) {
                        reportError(declaration, "Function may have only one $kind parameter")
                    }
                }
            }

            lastKind = kind
        }

        for ((i, param) in declaration.typeParameters.withIndex()) {
            if (param.index != i) {
                reportError(declaration, "Inconsistent index of type parameter ${param.index} != $i")
            }
        }
    }

    override fun visitDeclarationReference(expression: IrDeclarationReference) {
        super.visitDeclarationReference(expression)

        // TODO: Fix unbound dynamic filed declarations
        if (expression is IrFieldAccessExpression) {
            val receiverType = expression.receiver?.type
            if (receiverType is IrDynamicType)
                return
        }

        expression.symbol.ensureBound(expression)
    }

    override fun visitDeclaration(declaration: IrDeclarationBase) {
        super.visitDeclaration(declaration)

        if (declaration is IrOverridableDeclaration<*>) {
            for (overriddenSymbol in declaration.overriddenSymbols) {
                val overriddenDeclaration = overriddenSymbol.owner as? IrDeclarationWithVisibility ?: continue
                if (overriddenDeclaration.visibility == DescriptorVisibilities.PRIVATE) {
                    reportError(declaration, "Overrides private declaration $overriddenDeclaration")
                }
            }
        }
    }

    override fun visitFunctionAccess(expression: IrFunctionAccessExpression) {
        super.visitFunctionAccess(expression)

        expression.symbol.ensureBound(expression)
    }

    override fun visitFunctionReference(expression: IrFunctionReference) {
        super.visitFunctionReference(expression)
        expression.checkFunction(expression.symbol.owner)
        expression.symbol.ensureBound(expression)
    }

    override fun visitPropertyReference(expression: IrPropertyReference) {
        super.visitPropertyReference(expression)

        expression.field?.ensureBound(expression)
        expression.getter?.ensureBound(expression)
        expression.setter?.ensureBound(expression)
    }

    override fun visitLocalDelegatedPropertyReference(expression: IrLocalDelegatedPropertyReference) {
        super.visitLocalDelegatedPropertyReference(expression)

        expression.delegate.ensureBound(expression)
        expression.getter.ensureBound(expression)
        expression.setter?.ensureBound(expression)
    }

    override fun visitExpression(expression: IrExpression) {
        checkType(expression.type, expression)
        super.visitExpression(expression)
    }

    private fun checkType(type: IrType, element: IrElement) {
        if (type is IrSimpleType) {
            if (!type.classifier.isBound) {
                reportError(element, "Type: ${type.render()} has unbound classifier")
            }
        }
    }
}
