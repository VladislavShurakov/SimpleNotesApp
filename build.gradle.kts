// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id ("com.google.dagger.hilt.android") version "2.48.1" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.12" apply false
}
val buildToolsVersion by extra("34.0.0")
val activityComposeVersion by extra("1.7.2")
