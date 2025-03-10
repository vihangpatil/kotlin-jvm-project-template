plugins {
    `java-library`
    kotlin("jvm")
}

dependencies {
    implementation(Kotlin.stdlib)

    // test
    testImplementation("io.kotest:kotest-runner-junit5-jvm:_")
}
