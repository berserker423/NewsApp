package com.greedygame.newsbreeze.core.di


import android.content.Context
import androidx.paging.ExperimentalPagingApi
import androidx.room.Room
import com.greedygame.newsbreeze.BuildConfig
import com.greedygame.newsbreeze.core.persistance.AppDatabase
import com.greedygame.newsbreeze.core.service.Service
import com.greedygame.newsbreeze.feature.NewsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Singleton
    @Provides
    fun provideYourDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        AppDatabase::class.java,
        "news_db"
    ).build()

    @Provides
    @Singleton
    fun provideService(): Service {
        return Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .client(createClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(Service::class.java)
    }

    private fun createClient(): OkHttpClient {
        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val loggingInterceptor =
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)
            okHttpClientBuilder.addInterceptor(loggingInterceptor)
        }
        return okHttpClientBuilder.build()
    }


    @ExperimentalPagingApi
    @Provides
    @Singleton
    fun provideNewsRepo(newsRepo: NewsRepo.Network): NewsRepo =
        newsRepo
}