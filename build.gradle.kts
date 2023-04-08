plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "com.codingpotato"
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

tasks.run<JavaExec> {
    standardInput = System.`in`
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClassName = "com.codingpotato.kotlinfornoobs.Main"
}