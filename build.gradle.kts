plugins {
    id("java")
    alias(libs.plugins.intelliJ)
    alias(libs.plugins.kotlin)
}

version = "2025.1"

intellij {
    version.set(libs.versions.intelliJ.version.get())
    plugins.set(
        listOf(
            "org.jetbrains.android:${libs.versions.android.plugin.get()}",
            "java",
            "platform-images"
        )
    ) // Specify Android plugin with explicit version
    updateSinceUntilBuild.set(false)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }

    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.commons.io)
    implementation(libs.commons.math3)
    implementation(libs.commons.lang3)
    implementation(libs.imgscalr.lib)
    implementation(libs.thumbnailator)
    implementation(libs.gson)
}

tasks.buildSearchableOptions {
    enabled = false
}