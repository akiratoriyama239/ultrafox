plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ultrafox.browser"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ultrafox.browser"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}
