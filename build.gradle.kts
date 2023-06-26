buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    val androidBuildToolsVersion = "8.0.2"
    val jbKotlinGradleVersion = "1.8.21"
    val sqlDelightVersion = "1.5.5"

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$jbKotlinGradleVersion")
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
        classpath("com.android.tools.build:gradle:$androidBuildToolsVersion")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}