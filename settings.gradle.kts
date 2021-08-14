pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.11.0"

}

gradle.allprojects {
    group = "io.pixeloutlaw.worldguard"

    repositories {
        jcenter()
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
