plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlinx.binary-compatibility-validator")
    `jvm-test-suite`
}

description = "WorldGuard 6.2.x Adapters for MythicDrops"

dependencies {
    compileOnly("org.spigotmc:spigot-api:_")
    compileOnly("com.sk89q.worldguard:worldguard-legacy:_")

    api(project(":adapter-api"))

    implementation(kotlin("stdlib-jdk8"))
}

kotlin {
    explicitApi()
}
