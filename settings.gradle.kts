pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.2"
    id("com.gradle.enterprise") version "3.14.1"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

gradle.allprojects {
    group = "io.pixeloutlaw.worldguard"

    repositories {
        mavenCentral()
        maven {
            url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
        }
        maven {
            url = uri("https://maven.enginehub.org/repo")
        }
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/snapshots")
        }
    }
}

rootProject.name = "worldguard-adapters"

include(
    "adapter-api",
    "adapter-6.2.x",
    "adapter-7.0.x",
    "adapter-lib"
)
