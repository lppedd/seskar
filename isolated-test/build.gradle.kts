plugins {
    kotlin("js") version "1.7.22"
    id("io.github.turansky.kfc.application") version "5.71.0"
    id("io.github.turansky.seskar") version "0.20.0"
}

dependencies {
    implementation("io.github.turansky.seskar:seskar-core:0.20.0")

    testImplementation(kotlin("test-js"))
}

tasks.wrapper {
    gradleVersion = "7.5.1"
}
