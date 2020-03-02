plugins {
    kotlin("jvm") version "1.3.61"
    application
}

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("passed", "skipped", "failed")
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    val junitJupiterVersion = "5.2.0"

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testImplementation("org.junit.platform:junit-platform-runner:1.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitJupiterVersion")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    testImplementation("com.github.appium:java-client:7.3.0")
}

application {
    mainClassName = "com.sierisimo.j4g.appium.AppKt"
}
