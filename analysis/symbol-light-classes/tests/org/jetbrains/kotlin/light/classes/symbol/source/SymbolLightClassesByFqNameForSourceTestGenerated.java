/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.light.classes.symbol.source;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName")
@TestDataPath("$PROJECT_ROOT")
public class SymbolLightClassesByFqNameForSourceTestGenerated extends AbstractSymbolLightClassesByFqNameForSourceTest {
  @Test
  public void testAllFilesPresentInLightClassByFqName() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("AnnotatedParameterInEnumConstructor.kt")
  public void testAnnotatedParameterInEnumConstructor() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotatedParameterInEnumConstructor.kt");
  }

  @Test
  @TestMetadata("AnnotatedParameterInInnerClassConstructor.kt")
  public void testAnnotatedParameterInInnerClassConstructor() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotatedParameterInInnerClassConstructor.kt");
  }

  @Test
  @TestMetadata("AnnotatedPropertyWithSites.kt")
  public void testAnnotatedPropertyWithSites() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotatedPropertyWithSites.kt");
  }

  @Test
  @TestMetadata("annotationBinaryRetention.kt")
  public void testAnnotationBinaryRetention() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/annotationBinaryRetention.kt");
  }

  @Test
  @TestMetadata("AnnotationClass.kt")
  public void testAnnotationClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationClass.kt");
  }

  @Test
  @TestMetadata("AnnotationJavaRepeatable.kt")
  public void testAnnotationJavaRepeatable() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationJavaRepeatable.kt");
  }

  @Test
  @TestMetadata("AnnotationJvmRepeatable.kt")
  public void testAnnotationJvmRepeatable() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationJvmRepeatable.kt");
  }

  @Test
  @TestMetadata("AnnotationKotlinAndJavaRepeatable.kt")
  public void testAnnotationKotlinAndJavaRepeatable() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationKotlinAndJavaRepeatable.kt");
  }

  @Test
  @TestMetadata("AnnotationKotlinAndJvmRepeatable.kt")
  public void testAnnotationKotlinAndJvmRepeatable() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationKotlinAndJvmRepeatable.kt");
  }

  @Test
  @TestMetadata("AnnotationRepeatable.kt")
  public void testAnnotationRepeatable() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/AnnotationRepeatable.kt");
  }

  @Test
  @TestMetadata("BackingFields.kt")
  public void testBackingFields() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/BackingFields.kt");
  }

  @Test
  @TestMetadata("classAndCompanionDelegatedProperty.kt")
  public void testClassAndCompanionDelegatedProperty() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/classAndCompanionDelegatedProperty.kt");
  }

  @Test
  @TestMetadata("classAndCompanionJvmFieldProperty.kt")
  public void testClassAndCompanionJvmFieldProperty() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/classAndCompanionJvmFieldProperty.kt");
  }

  @Test
  @TestMetadata("classAndCompanionProperty.kt")
  public void testClassAndCompanionProperty() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/classAndCompanionProperty.kt");
  }

  @Test
  @TestMetadata("classJvmFieldAndCompanionJvmFieldProperty.kt")
  public void testClassJvmFieldAndCompanionJvmFieldProperty() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/classJvmFieldAndCompanionJvmFieldProperty.kt");
  }

  @Test
  @TestMetadata("classJvmFieldAndCompanionProperty.kt")
  public void testClassJvmFieldAndCompanionProperty() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/classJvmFieldAndCompanionProperty.kt");
  }

  @Test
  @TestMetadata("ClassTypeParameterAnnotation.kt")
  public void testClassTypeParameterAnnotation() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ClassTypeParameterAnnotation.kt");
  }

  @Test
  @TestMetadata("CompanionObject.kt")
  public void testCompanionObject() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/CompanionObject.kt");
  }

  @Test
  @TestMetadata("CompanionObjectWithAConflictingProperty.kt")
  public void testCompanionObjectWithAConflictingProperty() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/CompanionObjectWithAConflictingProperty.kt");
  }

  @Test
  @TestMetadata("constructorWithValueClass.kt")
  public void testConstructorWithValueClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/constructorWithValueClass.kt");
  }

  @Test
  @TestMetadata("constructorWithValueClassAsProperty.kt")
  public void testConstructorWithValueClassAsProperty() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/constructorWithValueClassAsProperty.kt");
  }

  @Test
  @TestMetadata("Constructors.kt")
  public void testConstructors() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/Constructors.kt");
  }

  @Test
  @TestMetadata("DataClassWithCustomImplementedMembers.kt")
  public void testDataClassWithCustomImplementedMembers() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DataClassWithCustomImplementedMembers.kt");
  }

  @Test
  @TestMetadata("DefaultImplsWithTypeParameters.kt")
  public void testDefaultImplsWithTypeParameters() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DefaultImplsWithTypeParameters.kt");
  }

  @Test
  @TestMetadata("DelegatedNested.kt")
  public void testDelegatedNested() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DelegatedNested.kt");
  }

  @Test
  @TestMetadata("Delegation.kt")
  public void testDelegation() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/Delegation.kt");
  }

  @Test
  @TestMetadata("Deprecated.kt")
  public void testDeprecated() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/Deprecated.kt");
  }

  @Test
  @TestMetadata("DeprecatedEnumEntry.kt")
  public void testDeprecatedEnumEntry() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DeprecatedEnumEntry.kt");
  }

  @Test
  @TestMetadata("DeprecatedNotHiddenInClass.kt")
  public void testDeprecatedNotHiddenInClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DeprecatedNotHiddenInClass.kt");
  }

  @Test
  @TestMetadata("DollarsInName.kt")
  public void testDollarsInName() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DollarsInName.kt");
  }

  @Test
  @TestMetadata("DollarsInNameNoPackage.kt")
  public void testDollarsInNameNoPackage() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/DollarsInNameNoPackage.kt");
  }

  @Test
  @TestMetadata("EnumClass.kt")
  public void testEnumClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/EnumClass.kt");
  }

  @Test
  @TestMetadata("EnumClassWithEnumEntries.kt")
  public void testEnumClassWithEnumEntries() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/EnumClassWithEnumEntries.kt");
  }

  @Test
  @TestMetadata("EnumEntry.kt")
  public void testEnumEntry() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/EnumEntry.kt");
  }

  @Test
  @TestMetadata("ExtendingInterfaceWithDefaultImpls.kt")
  public void testExtendingInterfaceWithDefaultImpls() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ExtendingInterfaceWithDefaultImpls.kt");
  }

  @Test
  @TestMetadata("HiddenDeprecated.kt")
  public void testHiddenDeprecated() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/HiddenDeprecated.kt");
  }

  @Test
  @TestMetadata("HiddenDeprecatedInClass.kt")
  public void testHiddenDeprecatedInClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/HiddenDeprecatedInClass.kt");
  }

  @Test
  @TestMetadata("InheritingInterfaceDefaultImpls.kt")
  public void testInheritingInterfaceDefaultImpls() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InheritingInterfaceDefaultImpls.kt");
  }

  @Test
  @TestMetadata("InlineReified.kt")
  public void testInlineReified() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InlineReified.kt");
  }

  @Test
  @TestMetadata("InterfaceTypeParameterAnnotation.kt")
  public void testInterfaceTypeParameterAnnotation() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InterfaceTypeParameterAnnotation.kt");
  }

  @Test
  @TestMetadata("InterfaceWithDefaultMethodAndCompanion.kt")
  public void testInterfaceWithDefaultMethodAndCompanion() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InterfaceWithDefaultMethodAndCompanion.kt");
  }

  @Test
  @TestMetadata("internalValueClass.kt")
  public void testInternalValueClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/internalValueClass.kt");
  }

  @Test
  @TestMetadata("InvalidJavaIdentifierAsAnnotationArgument.kt")
  public void testInvalidJavaIdentifierAsAnnotationArgument() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InvalidJavaIdentifierAsAnnotationArgument.kt");
  }

  @Test
  @TestMetadata("InvalidJavaIdentifierAsPropertyInitializer.kt")
  public void testInvalidJavaIdentifierAsPropertyInitializer() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/InvalidJavaIdentifierAsPropertyInitializer.kt");
  }

  @Test
  @TestMetadata("JavaBetween.kt")
  public void testJavaBetween() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/JavaBetween.kt");
  }

  @Test
  @TestMetadata("JavaClassWithAnnotation.kt")
  public void testJavaClassWithAnnotation() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/JavaClassWithAnnotation.kt");
  }

  @Test
  @TestMetadata("JvmNameOnMember.kt")
  public void testJvmNameOnMember() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/JvmNameOnMember.kt");
  }

  @Test
  @TestMetadata("JvmStatic.kt")
  public void testJvmStatic() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/JvmStatic.kt");
  }

  @Test
  @TestMetadata("LocalFunctions.kt")
  public void testLocalFunctions() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/LocalFunctions.kt");
  }

  @Test
  @TestMetadata("MethodTypeParameterAnnotation.kt")
  public void testMethodTypeParameterAnnotation() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/MethodTypeParameterAnnotation.kt");
  }

  @Test
  @TestMetadata("NestedObjects.kt")
  public void testNestedObjects() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/NestedObjects.kt");
  }

  @Test
  @TestMetadata("NestedTypeAnnotations.kt")
  public void testNestedTypeAnnotations() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/NestedTypeAnnotations.kt");
  }

  @Test
  @TestMetadata("NonDataClassWithComponentFunctions.kt")
  public void testNonDataClassWithComponentFunctions() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/NonDataClassWithComponentFunctions.kt");
  }

  @Test
  @TestMetadata("OnlySecondaryConstructors.kt")
  public void testOnlySecondaryConstructors() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/OnlySecondaryConstructors.kt");
  }

  @Test
  @TestMetadata("PrivateObject.kt")
  public void testPrivateObject() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/PrivateObject.kt");
  }

  @Test
  @TestMetadata("privateValueClass.kt")
  public void testPrivateValueClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/privateValueClass.kt");
  }

  @Test
  @TestMetadata("PropertyTypeParameterAnnotation.kt")
  public void testPropertyTypeParameterAnnotation() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/PropertyTypeParameterAnnotation.kt");
  }

  @Test
  @TestMetadata("PublishedApi.kt")
  public void testPublishedApi() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/PublishedApi.kt");
  }

  @Test
  @TestMetadata("SimpleObject.kt")
  public void testSimpleObject() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/SimpleObject.kt");
  }

  @Test
  @TestMetadata("SimplePublicField.kt")
  public void testSimplePublicField() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/SimplePublicField.kt");
  }

  @Test
  @TestMetadata("SpecialAnnotationsOnAnnotationClass.kt")
  public void testSpecialAnnotationsOnAnnotationClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/SpecialAnnotationsOnAnnotationClass.kt");
  }

  @Test
  @TestMetadata("StubOrderForOverloads.kt")
  public void testStubOrderForOverloads() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/StubOrderForOverloads.kt");
  }

  @Test
  @TestMetadata("SubstitutionOverride.kt")
  public void testSubstitutionOverride() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/SubstitutionOverride.kt");
  }

  @Test
  @TestMetadata("Throws.kt")
  public void testThrows() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/Throws.kt");
  }

  @Test
  @TestMetadata("TypePararametersInClass.kt")
  public void testTypePararametersInClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/TypePararametersInClass.kt");
  }

  @Test
  @TestMetadata("UnitAsTypeAlias.kt")
  public void testUnitAsTypeAlias() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/UnitAsTypeAlias.kt");
  }

  @Test
  @TestMetadata("ValueClassInParametersWithJvmName.kt")
  public void testValueClassInParametersWithJvmName() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ValueClassInParametersWithJvmName.kt");
  }

  @Test
  @TestMetadata("valueClassMembers.kt")
  public void testValueClassMembers() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/valueClassMembers.kt");
  }

  @Test
  @TestMetadata("valueClassWithDelegatedSuperInterface.kt")
  public void testValueClassWithDelegatedSuperInterface() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/valueClassWithDelegatedSuperInterface.kt");
  }

  @Test
  @TestMetadata("valueClassWithInternalParam.kt")
  public void testValueClassWithInternalParam() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/valueClassWithInternalParam.kt");
  }

  @Test
  @TestMetadata("valueClassWithPrivateParam.kt")
  public void testValueClassWithPrivateParam() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/valueClassWithPrivateParam.kt");
  }

  @Test
  @TestMetadata("valueClassWithSuperInterface.kt")
  public void testValueClassWithSuperInterface() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/valueClassWithSuperInterface.kt");
  }

  @Test
  @TestMetadata("valueClassWithValueClass.kt")
  public void testValueClassWithValueClass() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/valueClassWithValueClass.kt");
  }

  @Test
  @TestMetadata("VarArgs.kt")
  public void testVarArgs() {
    runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/VarArgs.kt");
  }

  @Nested
  @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors")
  @TestDataPath("$PROJECT_ROOT")
  public class CompilationErrors {
    @Test
    @TestMetadata("ActualClass.kt")
    public void testActualClass() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/ActualClass.kt");
    }

    @Test
    @TestMetadata("ActualTypeAlias.kt")
    public void testActualTypeAlias() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/ActualTypeAlias.kt");
    }

    @Test
    @TestMetadata("ActualTypeAliasCustomJvmPackageName.kt")
    public void testActualTypeAliasCustomJvmPackageName() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/ActualTypeAliasCustomJvmPackageName.kt");
    }

    @Test
    public void testAllFilesPresentInCompilationErrors() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("AllInlineOnly.kt")
    public void testAllInlineOnly() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/AllInlineOnly.kt");
    }

    @Test
    @TestMetadata("AnnotationModifiers.kt")
    public void testAnnotationModifiers() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/AnnotationModifiers.kt");
    }

    @Test
    @TestMetadata("EnumNameOverride.kt")
    public void testEnumNameOverride() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/EnumNameOverride.kt");
    }

    @Test
    @TestMetadata("ExpectClass.kt")
    public void testExpectClass() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/ExpectClass.kt");
    }

    @Test
    @TestMetadata("ExpectObject.kt")
    public void testExpectObject() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/ExpectObject.kt");
    }

    @Test
    @TestMetadata("ExpectedNestedClass.kt")
    public void testExpectedNestedClass() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/ExpectedNestedClass.kt");
    }

    @Test
    @TestMetadata("ExpectedNestedClassInObject.kt")
    public void testExpectedNestedClassInObject() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/ExpectedNestedClassInObject.kt");
    }

    @Test
    @TestMetadata("FieldWithoutName.kt")
    public void testFieldWithoutName() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/FieldWithoutName.kt");
    }

    @Test
    @TestMetadata("FieldWithoutName2.kt")
    public void testFieldWithoutName2() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/FieldWithoutName2.kt");
    }

    @Test
    @TestMetadata("FieldWithoutName3.kt")
    public void testFieldWithoutName3() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/FieldWithoutName3.kt");
    }

    @Test
    @TestMetadata("FunctionWithoutName.kt")
    public void testFunctionWithoutName() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/FunctionWithoutName.kt");
    }

    @Test
    @TestMetadata("JvmPackageName.kt")
    public void testJvmPackageName() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/JvmPackageName.kt");
    }

    @Test
    @TestMetadata("LocalInAnnotation.kt")
    public void testLocalInAnnotation() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/LocalInAnnotation.kt");
    }

    @Test
    @TestMetadata("MultiplatformCommonFacade.kt")
    public void testMultiplatformCommonFacade() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/MultiplatformCommonFacade.kt");
    }

    @Test
    @TestMetadata("MultiplatformIntermediateFacade.kt")
    public void testMultiplatformIntermediateFacade() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/MultiplatformIntermediateFacade.kt");
    }

    @Test
    @TestMetadata("MultiplatformJvmFacade.kt")
    public void testMultiplatformJvmFacade() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/MultiplatformJvmFacade.kt");
    }

    @Test
    @TestMetadata("PrivateInTrait.kt")
    public void testPrivateInTrait() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/PrivateInTrait.kt");
    }

    @Test
    @TestMetadata("PropertyWithoutName.kt")
    public void testPropertyWithoutName() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/PropertyWithoutName.kt");
    }

    @Test
    @TestMetadata("RepetableAnnotations.kt")
    public void testRepetableAnnotations() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/RepetableAnnotations.kt");
    }

    @Test
    @TestMetadata("SameName.kt")
    public void testSameName() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/SameName.kt");
    }

    @Test
    @TestMetadata("TopLevelDestructuring.kt")
    public void testTopLevelDestructuring() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/TopLevelDestructuring.kt");
    }

    @Test
    @TestMetadata("TraitClassObjectField.kt")
    public void testTraitClassObjectField() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/TraitClassObjectField.kt");
    }

    @Test
    @TestMetadata("TwoOverrides.kt")
    public void testTwoOverrides() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/TwoOverrides.kt");
    }

    @Test
    @TestMetadata("typeAliasActualization.kt")
    public void testTypeAliasActualization() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/typeAliasActualization.kt");
    }

    @Test
    @TestMetadata("typeAliasActualization2.kt")
    public void testTypeAliasActualization2() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/typeAliasActualization2.kt");
    }

    @Test
    @TestMetadata("UnitAsTypeAliasActualization.kt")
    public void testUnitAsTypeAliasActualization() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/UnitAsTypeAliasActualization.kt");
    }

    @Test
    @TestMetadata("unresolvedQuialifierInAnnotation.kt")
    public void testUnresolvedQuialifierInAnnotation() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/unresolvedQuialifierInAnnotation.kt");
    }

    @Test
    @TestMetadata("valueClassInSuperType.kt")
    public void testValueClassInSuperType() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/valueClassInSuperType.kt");
    }

    @Test
    @TestMetadata("WrongAnnotations.kt")
    public void testWrongAnnotations() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/compilationErrors/WrongAnnotations.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation")
  @TestDataPath("$PROJECT_ROOT")
  public class Delegation {
    @Test
    public void testAllFilesPresentInDelegation() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("Function.kt")
    public void testFunction() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation/Function.kt");
    }

    @Test
    @TestMetadata("Property.kt")
    public void testProperty() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation/Property.kt");
    }

    @Test
    @TestMetadata("WithImplicitType.kt")
    public void testWithImplicitType() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/delegation/WithImplicitType.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/facades")
  @TestDataPath("$PROJECT_ROOT")
  public class Facades {
    @Test
    public void testAllFilesPresentInFacades() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/facades"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("AllPrivate.kt")
    public void testAllPrivate() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/AllPrivate.kt");
    }

    @Test
    @TestMetadata("DelegatedProperty.kt")
    public void testDelegatedProperty() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/DelegatedProperty.kt");
    }

    @Test
    @TestMetadata("Deprecated.kt")
    public void testDeprecated() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/Deprecated.kt");
    }

    @Test
    @TestMetadata("FunctionTypeParameterAnnotation.kt")
    public void testFunctionTypeParameterAnnotation() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/FunctionTypeParameterAnnotation.kt");
    }

    @Test
    @TestMetadata("InternalFacadeClass.kt")
    public void testInternalFacadeClass() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/InternalFacadeClass.kt");
    }

    @Test
    @TestMetadata("MultiFile.kt")
    public void testMultiFile() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/MultiFile.kt");
    }

    @Test
    @TestMetadata("PropertyTypeParameterAnnotation.kt")
    public void testPropertyTypeParameterAnnotation() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/PropertyTypeParameterAnnotation.kt");
    }

    @Test
    @TestMetadata("SingleFile.kt")
    public void testSingleFile() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/SingleFile.kt");
    }

    @Test
    @TestMetadata("SingleJvmClassName.kt")
    public void testSingleJvmClassName() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/SingleJvmClassName.kt");
    }

    @Test
    @TestMetadata("ValueClassInParametersWithJvmName.kt")
    public void testValueClassInParametersWithJvmName() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/facades/ValueClassInParametersWithJvmName.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression")
  @TestDataPath("$PROJECT_ROOT")
  public class IdeRegression {
    @Test
    public void testAllFilesPresentInIdeRegression() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("AllOpenAnnotatedClasses.kt")
    public void testAllOpenAnnotatedClasses() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/AllOpenAnnotatedClasses.kt");
    }

    @Test
    @TestMetadata("ImplementingCharSequenceAndNumber.kt")
    public void testImplementingCharSequenceAndNumber() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/ImplementingCharSequenceAndNumber.kt");
    }

    @Test
    @TestMetadata("ImplementingMap.kt")
    public void testImplementingMap() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/ImplementingMap.kt");
    }

    @Test
    @TestMetadata("ImplementingMutableSet.kt")
    public void testImplementingMutableSet() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/ImplementingMutableSet.kt");
    }

    @Test
    @TestMetadata("InheritingInterfaceDefaultImpls.kt")
    public void testInheritingInterfaceDefaultImpls() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/InheritingInterfaceDefaultImpls.kt");
    }

    @Test
    @TestMetadata("OverridingFinalInternal.kt")
    public void testOverridingFinalInternal() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/OverridingFinalInternal.kt");
    }

    @Test
    @TestMetadata("OverridingInternal.kt")
    public void testOverridingInternal() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/OverridingInternal.kt");
    }

    @Test
    @TestMetadata("OverridingProtected.kt")
    public void testOverridingProtected() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/ideRegression/OverridingProtected.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations")
  @TestDataPath("$PROJECT_ROOT")
  public class NullabilityAnnotations {
    @Test
    public void testAllFilesPresentInNullabilityAnnotations() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("Class.kt")
    public void testClass() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Class.kt");
    }

    @Test
    @TestMetadata("ClassObjectField.kt")
    public void testClassObjectField() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/ClassObjectField.kt");
    }

    @Test
    @TestMetadata("ClassWithConstructor.kt")
    public void testClassWithConstructor() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/ClassWithConstructor.kt");
    }

    @Test
    @TestMetadata("ClassWithConstructorAndProperties.kt")
    public void testClassWithConstructorAndProperties() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/ClassWithConstructorAndProperties.kt");
    }

    @Test
    @TestMetadata("FileFacade.kt")
    public void testFileFacade() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/FileFacade.kt");
    }

    @Test
    @TestMetadata("Generic.kt")
    public void testGeneric() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Generic.kt");
    }

    @Test
    @TestMetadata("ImplicitArrayWithFlexibleParameterTypes.kt")
    public void testImplicitArrayWithFlexibleParameterTypes() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/ImplicitArrayWithFlexibleParameterTypes.kt");
    }

    @Test
    @TestMetadata("IntOverridesAny.kt")
    public void testIntOverridesAny() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/IntOverridesAny.kt");
    }

    @Test
    @TestMetadata("JvmOverloads.kt")
    public void testJvmOverloads() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/JvmOverloads.kt");
    }

    @Test
    @TestMetadata("NullableUnitReturn.kt")
    public void testNullableUnitReturn() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/NullableUnitReturn.kt");
    }

    @Test
    @TestMetadata("OverrideAnyWithUnit.kt")
    public void testOverrideAnyWithUnit() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/OverrideAnyWithUnit.kt");
    }

    @Test
    @TestMetadata("PlatformTypes.kt")
    public void testPlatformTypes() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/PlatformTypes.kt");
    }

    @Test
    @TestMetadata("PrimitiveBackedInlineClasses.kt")
    public void testPrimitiveBackedInlineClasses() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/PrimitiveBackedInlineClasses.kt");
    }

    @Test
    @TestMetadata("Primitives.kt")
    public void testPrimitives() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Primitives.kt");
    }

    @Test
    @TestMetadata("PrivateInClass.kt")
    public void testPrivateInClass() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/PrivateInClass.kt");
    }

    @Test
    @TestMetadata("Synthetic.kt")
    public void testSynthetic() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Synthetic.kt");
    }

    @Test
    @TestMetadata("Trait.kt")
    public void testTrait() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/Trait.kt");
    }

    @Test
    @TestMetadata("typeAlias.kt")
    public void testTypeAlias() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/typeAlias.kt");
    }

    @Test
    @TestMetadata("UnitAsGenericArgument.kt")
    public void testUnitAsGenericArgument() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/UnitAsGenericArgument.kt");
    }

    @Test
    @TestMetadata("UnitParameter.kt")
    public void testUnitParameter() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/UnitParameter.kt");
    }

    @Test
    @TestMetadata("VoidReturn.kt")
    public void testVoidReturn() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/nullabilityAnnotations/VoidReturn.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/script")
  @TestDataPath("$PROJECT_ROOT")
  public class Script {
    @Test
    public void testAllFilesPresentInScript() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/script"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }
  }

  @Nested
  @TestMetadata("compiler/testData/asJava/lightClasses/lightClassByFqName/withTestCompilerPluginEnabled")
  @TestDataPath("$PROJECT_ROOT")
  public class WithTestCompilerPluginEnabled {
    @Test
    public void testAllFilesPresentInWithTestCompilerPluginEnabled() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/lightClassByFqName/withTestCompilerPluginEnabled"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("allOpen.kt")
    public void testAllOpen() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/withTestCompilerPluginEnabled/allOpen.kt");
    }

    @Test
    @TestMetadata("companionWithFoo_companionTypeUsedInJava_ReferenceFromKotlin.kt")
    public void testCompanionWithFoo_companionTypeUsedInJava_ReferenceFromKotlin() {
      runTest("compiler/testData/asJava/lightClasses/lightClassByFqName/withTestCompilerPluginEnabled/companionWithFoo_companionTypeUsedInJava_ReferenceFromKotlin.kt");
    }
  }
}
