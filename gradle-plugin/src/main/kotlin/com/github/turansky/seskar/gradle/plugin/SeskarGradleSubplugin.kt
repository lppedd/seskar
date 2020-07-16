package com.github.turansky.seskar.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

private val SESKAR_COMPILER_PLUGIN_ID = "com.github.turansky.seskar"

class SeskarGradleSubplugin : KotlinCompilerPluginSupportPlugin {
    override fun apply(target: Project) {
        super.apply(target)

        println("Seskar plugin applied!")
    }

    override fun isApplicable(
        kotlinCompilation: KotlinCompilation<*>
    ): Boolean =
        true

    override fun applyToCompilation(
        kotlinCompilation: KotlinCompilation<*>
    ): Provider<List<SubpluginOption>> =
        kotlinCompilation.target.project
            .provider { emptyList() }

    override fun getCompilerPluginId(): String =
        SESKAR_COMPILER_PLUGIN_ID

    override fun getPluginArtifact(): SubpluginArtifact =
        KOTLIN_PLUGIN_ARTIFACT
}
