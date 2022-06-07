plugins {
    java
    kotlin("jvm") version "1.6.10"
}

group = "com.cardlay.testsuite"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    val seleniumVersion = "4.2.1"
    api("org.seleniumhq.selenium:selenium-java:$seleniumVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}