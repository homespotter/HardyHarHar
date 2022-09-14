plugins {
    `java-library`
    kotlin("jvm") version "1.4.30"
    kotlin("plugin.serialization") version "1.4.30"
    maven
}

group = "com.github.homespotter"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.1.0")
}