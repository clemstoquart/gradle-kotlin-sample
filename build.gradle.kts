import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.repositories

plugins {
    id("java")
    id("org.springframework.boot") version "1.5.6.RELEASE"
}

version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}


dependencies {
    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("org.springframework.boot:spring-boot-starter-web")

    testCompile("org.springframework.boot:spring-boot-starter-test")
}
