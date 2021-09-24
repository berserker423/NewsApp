package com.greedygame.newsbreeze.core.di;

import android.content.Context;
import androidx.paging.ExperimentalPagingApi;
import androidx.room.Room;
import com.greedygame.newsbreeze.BuildConfig;
import com.greedygame.newsbreeze.core.persistance.AppDatabase;
import com.greedygame.newsbreeze.core.service.Service;
import com.greedygame.newsbreeze.feature.NewsRepo;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/greedygame/newsbreeze/core/di/ApplicationModule;", "", "()V", "createClient", "Lokhttp3/OkHttpClient;", "provideNewsRepo", "Lcom/greedygame/newsbreeze/feature/NewsRepo;", "newsRepo", "Lcom/greedygame/newsbreeze/feature/NewsRepo$Network;", "provideService", "Lcom/greedygame/newsbreeze/core/service/Service;", "provideYourDatabase", "Lcom/greedygame/newsbreeze/core/persistance/AppDatabase;", "app", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.greedygame.newsbreeze.core.persistance.AppDatabase provideYourDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.greedygame.newsbreeze.core.service.Service provideService() {
        return null;
    }
    
    private final okhttp3.OkHttpClient createClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    @androidx.paging.ExperimentalPagingApi()
    public final com.greedygame.newsbreeze.feature.NewsRepo provideNewsRepo(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.feature.NewsRepo.Network newsRepo) {
        return null;
    }
}