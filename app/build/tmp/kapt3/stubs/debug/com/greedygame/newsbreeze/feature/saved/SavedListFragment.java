package com.greedygame.newsbreeze.feature.saved;

import android.os.Bundle;
import android.view.View;
import androidx.paging.ExperimentalPagingApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.greedygame.newsbreeze.R;
import com.greedygame.newsbreeze.core.base.BaseFragment;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.databinding.FragmentSavedBinding;
import com.greedygame.newsbreeze.feature.NewsFragment;
import com.greedygame.newsbreeze.feature.NewsViewModel;
import com.greedygame.newsbreeze.feature.adapter.ItemCallBack;
import com.greedygame.newsbreeze.feature.adapter.SavedListAdapter;
import com.greedygame.newsbreeze.feature.detail.NewsDetailFragment;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/greedygame/newsbreeze/feature/saved/SavedListFragment;", "Lcom/greedygame/newsbreeze/core/base/BaseFragment;", "Lcom/greedygame/newsbreeze/databinding/FragmentSavedBinding;", "Lcom/greedygame/newsbreeze/feature/adapter/ItemCallBack;", "()V", "savedListAdapter", "Lcom/greedygame/newsbreeze/feature/adapter/SavedListAdapter;", "getSavedListAdapter", "()Lcom/greedygame/newsbreeze/feature/adapter/SavedListAdapter;", "viewModel", "Lcom/greedygame/newsbreeze/feature/saved/SavedListViewModel;", "getViewModel", "()Lcom/greedygame/newsbreeze/feature/saved/SavedListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchData", "", "layoutId", "", "onItemClick", "article", "Lcom/greedygame/newsbreeze/core/data/Article;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupView", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
@androidx.paging.ExperimentalPagingApi()
public final class SavedListFragment extends com.greedygame.newsbreeze.core.base.BaseFragment<com.greedygame.newsbreeze.databinding.FragmentSavedBinding> implements com.greedygame.newsbreeze.feature.adapter.ItemCallBack {
    @org.jetbrains.annotations.NotNull()
    private final com.greedygame.newsbreeze.feature.adapter.SavedListAdapter savedListAdapter = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.greedygame.newsbreeze.feature.saved.SavedListFragment.Companion Companion = null;
    
    public SavedListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.greedygame.newsbreeze.feature.adapter.SavedListAdapter getSavedListAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected int layoutId() {
        return 0;
    }
    
    private final com.greedygame.newsbreeze.feature.saved.SavedListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void fetchData() {
    }
    
    public final void setupView() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.data.Article article) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.greedygame.newsbreeze.feature.saved.SavedListFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/greedygame/newsbreeze/feature/saved/SavedListFragment$Companion;", "", "()V", "newInstance", "Lcom/greedygame/newsbreeze/feature/saved/SavedListFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.greedygame.newsbreeze.feature.saved.SavedListFragment newInstance() {
            return null;
        }
    }
}