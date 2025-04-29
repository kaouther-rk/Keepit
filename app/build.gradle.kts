plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.keepit"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.keepit"
        minSdk = 29
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    // AndroidX & Google Libraries
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.play.services.ads)
    implementation(libs.firebase.inappmessaging)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Room (for database)
    implementation("androidx.room:room-runtime:2.7.1")
    annotationProcessor("androidx.room:room-compiler:2.7.1")
    implementation("androidx.room:room-ktx:2.7.1")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    // Scalable size unit (support for different screen sizes)
    implementation("com.intuit.sdp:sdp-android:1.1.1")
    implementation("com.intuit.ssp:ssp-android:1.1.1")

    // Material Design
    implementation("com.google.android.material:material:1.12.0")

    // Rounded ImageView
    implementation("com.makeramen:roundedimageview:2.3.0")

    //  Rounded ImageView
    // implementation("de.hdodenhof:circleimageview:3.1.0")
}
