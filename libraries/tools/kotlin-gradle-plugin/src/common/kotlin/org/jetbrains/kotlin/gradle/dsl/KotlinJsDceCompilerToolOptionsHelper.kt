// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
// To regenerate run 'generateGradleOptions' task
@file:Suppress("RemoveRedundantQualifierName", "Deprecation", "DuplicatedCode")

package org.jetbrains.kotlin.gradle.dsl

internal object KotlinJsDceCompilerToolOptionsHelper {

    internal fun fillCompilerArguments(
        from: org.jetbrains.kotlin.gradle.dsl.KotlinJsDceCompilerToolOptions,
        args: org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerToolOptionsHelper.fillCompilerArguments(from, args)
        args.devMode = from.devMode.get()
        args.outputDirectory = from.outputDirectory.orNull
    }

    internal fun fillDefaultValues(
        args: org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerToolOptionsHelper.fillDefaultValues(args)
        args.devMode = false
        args.outputDirectory = null
    }
}
