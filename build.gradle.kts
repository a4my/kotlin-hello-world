plugins {
    kotlin("jvm") version "1.9.0"
    application
}

application {
    mainClass.set("MainKt")
}

group = "a4my"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
