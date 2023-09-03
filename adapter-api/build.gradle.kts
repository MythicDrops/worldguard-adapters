plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlinx.binary-compatibility-validator")
    `jvm-test-suite`
}

description = "WorldGuard Adapters API for MythicDrops"

dependencies {
    compileOnly("org.spigotmc:spigot-api:_")
    implementation(kotlin("stdlib-jdk8"))
}

kotlin {
    explicitApi()
}
