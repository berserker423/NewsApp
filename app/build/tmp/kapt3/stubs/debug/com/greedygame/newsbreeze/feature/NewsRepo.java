package com.greedygame.newsbreeze.feature;

import android.content.Context;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.core.persistance.AppDatabase;
import com.greedygame.newsbreeze.core.persistance.NewsListMediator;
import com.greedygame.newsbreeze.core.service.Service;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH&\u00a8\u0006\u0010"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsRepo;", "", "getSavedNewsDB", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/greedygame/newsbreeze/core/data/Article;", "getSearchResultStream", "Landroidx/paging/PagingData;", "query", "", "updateArticle", "", "isSaved", "", "title", "Network", "app_debug"})
@androidx.paging.ExperimentalPagingApi()
public abstract interface NewsRepo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.greedygame.newsbreeze.core.data.Article>> getSearchResultStream(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.greedygame.newsbreeze.core.data.Article>> getSavedNewsDB();
    
    public abstract void updateArticle(boolean isSaved, @org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsRepo$Network;", "Lcom/greedygame/newsbreeze/feature/NewsRepo;", "service", "Lcom/greedygame/newsbreeze/core/service/Service;", "db", "Lcom/greedygame/newsbreeze/core/persistance/AppDatabase;", "(Lcom/greedygame/newsbreeze/core/service/Service;Lcom/greedygame/newsbreeze/core/persistance/AppDatabase;)V", "getDefaultPageConfig", "Landroidx/paging/PagingConfig;", "getSavedNewsDB", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/greedygame/newsbreeze/core/data/Article;", "getSearchResultStream", "Landroidx/paging/PagingData;", "query", "", "updateArticle", "", "isSaved", "", "title", "app_debug"})
    public static final class Network implements com.greedygame.newsbreeze.feature.NewsRepo {
        private final com.greedygame.newsbreeze.core.service.Service service = null;
        private final com.greedygame.newsbreeze.core.persistance.AppDatabase db = null;
        
        @javax.inject.Inject()
        public Network(@org.jetbrains.annotations.NotNull()
        com.greedygame.newsbreeze.core.service.Service service, @org.jetbrains.annotations.NotNull()
        com.greedygame.newsbreeze.core.persistance.AppDatabase db) {
            super();
        }
        
        private final androidx.paging.PagingConfig getDefaultPageConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.greedygame.newsbreeze.core.data.Article>> getSearchResultStream(@org.jetbrains.annotations.NotNull()
        java.lang.String query) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.coroutines.flow.Flow<java.util.List<com.greedygame.newsbreeze.core.data.Article>> getSavedNewsDB() {
            return null;
        }
        
        @java.lang.Override()
        public void updateArticle(boolean isSaved, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
        }
    }
}