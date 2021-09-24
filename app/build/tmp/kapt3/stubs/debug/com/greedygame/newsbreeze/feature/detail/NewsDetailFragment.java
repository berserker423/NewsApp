package com.greedygame.newsbreeze.feature.detail;

import android.os.Bundle;
import android.view.View;
import androidx.paging.ExperimentalPagingApi;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.greedygame.newsbreeze.R;
import com.greedygame.newsbreeze.core.base.BaseFragment;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.databinding.FragmentNewsDetailBinding;
import com.greedygame.newsbreeze.feature.NewsViewModel;
import com.greedygame.newsbreeze.feature.UiModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/greedygame/newsbreeze/feature/detail/NewsDetailFragment;", "Lcom/greedygame/newsbreeze/core/base/BaseFragment;", "Lcom/greedygame/newsbreeze/databinding/FragmentNewsDetailBinding;", "()V", "viewModel", "Lcom/greedygame/newsbreeze/feature/NewsViewModel;", "getViewModel", "()Lcom/greedygame/newsbreeze/feature/NewsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initView", "", "article", "Lcom/greedygame/newsbreeze/core/data/Article;", "layoutId", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
@androidx.paging.ExperimentalPagingApi()
public final class NewsDetailFragment extends com.greedygame.newsbreeze.core.base.BaseFragment<com.greedygame.newsbreeze.databinding.FragmentNewsDetailBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.greedygame.newsbreeze.feature.detail.NewsDetailFragment.Companion Companion = null;
    
    public NewsDetailFragment() {
        super();
    }
    
    @java.lang.Override()
    protected int layoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.greedygame.newsbreeze.feature.NewsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.greedygame.newsbreeze.feature.detail.NewsDetailFragment newInstance(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.data.Article article) {
        return null;
    }
    
    private final void initView(com.greedygame.newsbreeze.core.data.Article article) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/greedygame/newsbreeze/feature/detail/NewsDetailFragment$Companion;", "", "()V", "newInstance", "Lcom/greedygame/newsbreeze/feature/detail/NewsDetailFragment;", "article", "Lcom/greedygame/newsbreeze/core/data/Article;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.greedygame.newsbreeze.feature.detail.NewsDetailFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.greedygame.newsbreeze.core.data.Article article) {
            return null;
        }
    }
}