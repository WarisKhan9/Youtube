plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.youtube"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.youtube"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.11"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {


    dependencies {

        // Core Android & Kotlin
        implementation("androidx.core:core-ktx:1.13.1")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

        // Jetpack Compose BOM (manages Compose versions consistently)
        implementation(platform("androidx.compose:compose-bom:2024.01.00"))

        // Compose UI & Material3
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.material3:material3")
        implementation("androidx.compose.ui:ui-tooling-preview")
        debugImplementation("androidx.compose.ui:ui-tooling")

        // Compose Activity & ViewModel integration
        implementation("androidx.activity:activity-compose:1.9.0")
        implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")

        // Navigation for Compose
        implementation("androidx.navigation:navigation-compose:2.7.7")

        // Image loading with Coil for Compose
        implementation("io.coil-kt:coil-compose:2.5.0")

        // Media3 ExoPlayer (video playback)
        implementation("androidx.media3:media3-exoplayer:1.3.1")
        implementation("androidx.media3:media3-ui:1.3.1")

        // Retrofit + Moshi + Logging (networking and JSON parsing)
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
        implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
        implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.11")

        testImplementation("junit:junit:4.13.2")
    }












    // Compose & Lifecycle
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")
//
//    implementation(platform("androidx.compose:compose-bom:2024.04.00")) // or latest stable
//    implementation(libs.androidx.activity.compose)
//    implementation(libs.androidx.compose.ui)
//    implementation(libs.androidx.compose.ui.graphics)
//    implementation(libs.androidx.compose.ui.tooling.preview)
//    implementation(libs.androidx.material3)
//
//    // Retrofit + GSON
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//
//    // Coil (image loading)
//    implementation("io.coil-kt:coil-compose:2.5.0")
//
//    // ExoPlayer
//    implementation("androidx.media3:media3-exoplayer:1.3.1")
//    implementation("androidx.media3:media3-ui:1.3.1")
//
//    // Logging (optional)
//    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
//
//
//
//    implementation("com.google.accompanist:accompanist-permissions:0.31.3-beta")
//    implementation(libs.androidx.navigation.compose.jvmstubs)
//    implementation(libs.androidx.navigation.compose.android)
//
//    // Testing
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
//    debugImplementation(libs.androidx.compose.ui.tooling)
//    debugImplementation(libs.androidx.compose.ui.test.manifest)
//
//    implementation("androidx.compose.ui:ui-text:1.6.4")
//
//    implementation("androidx.navigation:navigation-compose:2.7.7")
//

}
