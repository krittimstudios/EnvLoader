plugins {
    kotlin("jvm") version "2.2.0"
    `maven-publish`
}

group = "com.krittimstudios"
version = "1.0.0"

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
            groupId = "com.krittimstudios"
            artifactId = "envloader"
            version = "1.0.0"
            from(components["java"])
        }
    }
}