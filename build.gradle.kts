import org.gradle.kotlin.dsl.ext

plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.multiplatform) apply false
}

ext {
    set("compileSdkVersion", 33)
    set("minSdkVersion", 21)
    set("targetSdkVersion", 33)
    set("nameSpace", "com.android.kmm_lib")
    set("jvmTarget", "1.8")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
