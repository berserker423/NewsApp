plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.androidHilt)
    id(BuildPlugins.kotlin_parcelize)
}


android {
    compileSdk = AndroidSdk.compile
    defaultConfig {
        applicationId = AndroidClient.appId
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target
        versionCode = AndroidClient.versionCode
        versionName = AndroidClient.versionName
        multiDexEnabled = true
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner = AndroidClient.testRunner
    }

    buildFeatures {
        dataBinding = true
    }



    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    // For Kotlin projects
    kotlinOptions {
        jvmTarget = "11"
    }

    dexOptions {
        javaMaxHeapSize = "4G"
    }

    lintOptions {
        isCheckReleaseBuilds = false
        isAbortOnError = false
    }
}

dependencies {

    //Compile time dependencies
    kapt(Libraries.lifecycleCompiler)
    kapt(Libraries.hiltCompiler)

    // Application dependencies
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.kotlinCoroutines)
    implementation(Libraries.kotlinCoroutinesAndroid)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.viewModel)
    implementation(Libraries.liveData)
    implementation(Libraries.lifecycleExtensions)
    implementation(Libraries.cardView)
    implementation(Libraries.recyclerView)
    implementation(Libraries.material)
    implementation(Libraries.androidAnnotations)
    implementation(Libraries.glide)
    implementation(Libraries.hilt)
    implementation(Libraries.retrofit)
    implementation(Libraries.okHttpLoggingInterceptor)

    //room
    kapt(Libraries.roomCompiler)
    implementation(Libraries.room)
    implementation(Libraries.roomCoroutines)
    implementation(Libraries.roomPaging3)

    //paging3
    implementation(Libraries.paging3)


    //TODO: change this
    implementation("androidx.fragment:fragment-ktx:1.2.5")

}

kapt {
    correctErrorTypes = true
}