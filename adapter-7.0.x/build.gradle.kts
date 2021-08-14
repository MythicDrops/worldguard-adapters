plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlinx.binary-compatibility-validator")
}

description = "WorldGuard 7.0.x Adapters API for MythicDrops"

dependencies {
    compileOnly("org.spigotmc:spigot-api:_")
    compileOnly("com.sk89q.worldguard:worldguard-bukkit:_")

    api(project(":adapter-api"))

    implementation(kotlin("stdlib-jdk8"))
}
