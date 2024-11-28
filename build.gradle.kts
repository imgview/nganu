plugins {
    kotlin("jvm") version "1.9.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
}

application {
    mainClass.set("MainKt")
}