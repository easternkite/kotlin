// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
// To regenerate run 'generateGradleOptions' task
@file:Suppress("RemoveRedundantQualifierName", "Deprecation", "DuplicatedCode")

package org.jetbrains.kotlin.gradle.dsl

internal object KotlinNativeCompilerOptionsHelper {

    internal fun fillCompilerArguments(
        from: org.jetbrains.kotlin.gradle.dsl.KotlinNativeCompilerOptions,
        args: org.jetbrains.kotlin.cli.common.arguments.K2NativeCompilerArguments,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptionsHelper.fillCompilerArguments(from, args)
        args.moduleName = from.moduleName.orNull
    }

    internal fun fillDefaultValues(
        args: org.jetbrains.kotlin.cli.common.arguments.K2NativeCompilerArguments,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptionsHelper.fillDefaultValues(args)
        args.moduleName = null
    }
}
