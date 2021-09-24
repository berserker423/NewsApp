package com.greedygame.newsbreeze.feature;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Toast;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.greedygame.newsbreeze.R;
import com.greedygame.newsbreeze.core.base.BaseFragment;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.core.di.MyPreference;
import com.greedygame.newsbreeze.databinding.FragmentNewsBinding;
import com.greedygame.newsbreeze.feature.adapter.ListLoadStateAdapter;
import com.greedygame.newsbreeze.feature.detail.NewsDetailFragment;
import com.greedygame.newsbreeze.feature.saved.SavedListFragment;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.flow.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010$\u001a\u00020\u00162\b\b\u0002\u0010%\u001a\u00020&H\u0002J\u0006\u0010\'\u001a\u00020\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006-"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsFragment;", "Lcom/greedygame/newsbreeze/core/base/BaseFragment;", "Lcom/greedygame/newsbreeze/databinding/FragmentNewsBinding;", "Lcom/greedygame/newsbreeze/feature/ItemClickListener;", "()V", "adapter", "Lcom/greedygame/newsbreeze/feature/NewsListAdapter;", "pref", "Lcom/greedygame/newsbreeze/core/di/MyPreference;", "getPref", "()Lcom/greedygame/newsbreeze/core/di/MyPreference;", "setPref", "(Lcom/greedygame/newsbreeze/core/di/MyPreference;)V", "searchJob", "Lkotlinx/coroutines/Job;", "viewModel", "Lcom/greedygame/newsbreeze/feature/NewsViewModel;", "getViewModel", "()Lcom/greedygame/newsbreeze/feature/NewsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initAdapter", "", "initSearch", "layoutId", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "article", "Lcom/greedygame/newsbreeze/core/data/Article;", "onSave", "onViewCreated", "view", "Landroid/view/View;", "search", "query", "", "setupView", "showEmptyList", "show", "", "updateRepoListFromInput", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
@androidx.paging.ExperimentalPagingApi()
public final class NewsFragment extends com.greedygame.newsbreeze.core.base.BaseFragment<com.greedygame.newsbreeze.databinding.FragmentNewsBinding> implements com.greedygame.newsbreeze.feature.ItemClickListener {
    @javax.inject.Inject()
    public com.greedygame.newsbreeze.core.di.MyPreference pref;
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.greedygame.newsbreeze.feature.NewsListAdapter adapter = null;
    private kotlinx.coroutines.Job searchJob;
    @org.jetbrains.annotations.NotNull()
    public static final com.greedygame.newsbreeze.feature.NewsFragment.Companion Companion = null;
    
    public NewsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.greedygame.newsbreeze.core.di.MyPreference getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.di.MyPreference p0) {
    }
    
    private final com.greedygame.newsbreeze.feature.NewsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.greedygame.newsbreeze.feature.NewsFragment newInstance() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected int layoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setupView() {
    }
    
    private final void initAdapter() {
    }
    
    private final void initSearch() {
    }
    
    private final void updateRepoListFromInput() {
    }
    
    private final void showEmptyList(boolean show) {
    }
    
    private final void search(java.lang.String query) {
    }
    
    @java.lang.Override()
    public void onSave(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.data.Article article) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.data.Article article) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsFragment$Companion;", "", "()V", "newInstance", "Lcom/greedygame/newsbreeze/feature/NewsFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.greedygame.newsbreeze.feature.NewsFragment newInstance() {
            return null;
        }
    }
}