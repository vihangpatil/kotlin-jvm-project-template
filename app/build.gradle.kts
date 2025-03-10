plugins {
    application
    kotlin("jvm")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(project(":lib"))

    // kotlin
    implementation(Kotlin.stdlib)
    implementation(KotlinX.coroutines.jdk8)
    implementation(KotlinX.serialization.json)

    // logging
    implementation("org.slf4j:slf4j-api:_")
    runtimeOnly("ch.qos.logback:logback-classic:_")
    implementation(KotlinX.coroutines.slf4j)

    // test
    testImplementation("io.kotest:kotest-runner-junit5-jvm:_")
}

application {
    // Define the main class for the application.
    mainClass.set("dev.vihang.ktp.app.AppKt")
}
