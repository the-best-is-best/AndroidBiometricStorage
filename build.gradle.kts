// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("maven-publish")
    id("java")

}
apply(plugin = "maven-publish")

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "com.tbib"
            artifactId = "tbibbiometricstorage"
            version = "1.0.0"
        }
    }
    repositories {
        maven {
            url = uri("https://github.com/the-best-is-best/AndroidBiometricStorage")

        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}