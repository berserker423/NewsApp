package com.greedygame.newsbreeze.feature.saved;

import androidx.lifecycle.ViewModel;
import androidx.paging.ExperimentalPagingApi;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.feature.NewsRepo;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/greedygame/newsbreeze/feature/saved/SavedListViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepo", "Lcom/greedygame/newsbreeze/feature/NewsRepo;", "(Lcom/greedygame/newsbreeze/feature/NewsRepo;)V", "getNewsRepo", "()Lcom/greedygame/newsbreeze/feature/NewsRepo;", "getSavedList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/greedygame/newsbreeze/core/data/Article;", "app_debug"})
@androidx.paging.ExperimentalPagingApi()
public final class SavedListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.greedygame.newsbreeze.feature.NewsRepo newsRepo = null;
    
    @javax.inject.Inject()
    public SavedListViewModel(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.feature.NewsRepo newsRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.greedygame.newsbreeze.feature.NewsRepo getNewsRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.greedygame.newsbreeze.core.data.Article>> getSavedList() {
        return null;
    }
}