package com.greedygame.newsbreeze.feature;

import android.icu.text.CaseMap;
import androidx.lifecycle.ViewModel;
import androidx.paging.*;
import com.greedygame.newsbreeze.core.data.Article;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepo", "Lcom/greedygame/newsbreeze/feature/NewsRepo;", "(Lcom/greedygame/newsbreeze/feature/NewsRepo;)V", "currentQueryValue", "", "currentSearchResult", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/greedygame/newsbreeze/feature/UiModel;", "getNewsRepo", "()Lcom/greedygame/newsbreeze/feature/NewsRepo;", "searchNews", "queryString", "updateArticle", "", "isSaved", "", "title", "app_debug"})
@androidx.paging.ExperimentalPagingApi()
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.greedygame.newsbreeze.feature.NewsRepo newsRepo = null;
    private java.lang.String currentQueryValue;
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.greedygame.newsbreeze.feature.UiModel>> currentSearchResult;
    
    @javax.inject.Inject()
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.feature.NewsRepo newsRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.greedygame.newsbreeze.feature.NewsRepo getNewsRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.greedygame.newsbreeze.feature.UiModel>> searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString) {
        return null;
    }
    
    public final void updateArticle(boolean isSaved, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
}