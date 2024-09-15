plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

    id("androidx.navigation.safeargs.kotlin")
    id("com.google.devtools.ksp") version "2.0.20-1.0.24"


}

android {
    namespace = "com.example.kotlin1"
    compileSdk = 34


    buildFeatures {
        viewBinding = true
    }
    defaultConfig {
        applicationId = "com.example.kotlin1"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

}

dependencies {


    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.common)
    implementation(libs.androidx.monitor)
    implementation(libs.androidx.junit.ktx)
    implementation(libs.androidx.room.ktx)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.room.rxjava2)
    implementation(libs.kotlinx.coroutines.rx2)
    implementation(libs.kotlinx.coroutines.android.v164)
    implementation(libs.androidx.room.rxjava3)
    implementation(libs.androidx.room.guava)
    testImplementation(libs.androidx.room.testing)
    implementation (libs.androidx.room.runtime)

    implementation(libs.androidx.room.paging)
    implementation(libs.glide)
    implementation(libs.lottie.v340)
    debugImplementation(libs.library)
    releaseImplementation(libs.library.no.op)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.dynamic.features.fragment)
    implementation(libs.firebase.crashlytics.buildtools)
    androidTestImplementation(libs.androidx.navigation.testing)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.design)


    // To use Kotlin annotation processing tool (kapt)
    ksp(libs.androidx.room.compiler )

    //dagger hilt
    implementation(libs.google.dagger.compiler)
    ksp(libs.google.dagger.compiler)
    implementation(libs.androidx.hilt.navigation.fragment)


    //retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.gson)


    implementation (libs.androidx.runtime.livedata)
    implementation (libs.androidx.lifecycle.viewmodel.compose)


}


