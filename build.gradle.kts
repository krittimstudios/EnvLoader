plugins {
    kotlin("jvm") version "2.2.0"
    `maven-publish`
}

group = "com.krittimstudios"
version = "1.0.1"

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
    jvmToolchain(21)
}
java{
    withSourcesJar()
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "envloader"
            from(components["java"])
        }
    }
}