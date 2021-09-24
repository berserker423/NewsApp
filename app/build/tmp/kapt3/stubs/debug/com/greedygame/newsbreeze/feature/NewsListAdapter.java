package com.greedygame.newsbreeze.feature;

import com.greedygame.newsbreeze.core.data.Article;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.greedygame.newsbreeze.R;
import com.greedygame.newsbreeze.databinding.NewsListItemBinding;
import com.greedygame.newsbreeze.feature.adapter.SeparatorViewHolder;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsListAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/greedygame/newsbreeze/feature/UiModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemClickListener", "Lcom/greedygame/newsbreeze/feature/ItemClickListener;", "(Lcom/greedygame/newsbreeze/feature/ItemClickListener;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "NewsListViewHolder", "app_debug"})
public final class NewsListAdapter extends androidx.paging.PagingDataAdapter<com.greedygame.newsbreeze.feature.UiModel, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.greedygame.newsbreeze.feature.ItemClickListener itemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.greedygame.newsbreeze.feature.NewsListAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.greedygame.newsbreeze.feature.UiModel> UIMODEL_COMPARATOR = null;
    
    public NewsListAdapter(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.feature.ItemClickListener itemClickListener) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsListAdapter$NewsListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/greedygame/newsbreeze/databinding/NewsListItemBinding;", "(Lcom/greedygame/newsbreeze/databinding/NewsListItemBinding;)V", "getBinding", "()Lcom/greedygame/newsbreeze/databinding/NewsListItemBinding;", "bind", "", "item", "Lcom/greedygame/newsbreeze/core/data/Article;", "itemClickListener", "Lcom/greedygame/newsbreeze/feature/ItemClickListener;", "Companion", "app_debug"})
    public static final class NewsListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.greedygame.newsbreeze.databinding.NewsListItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.greedygame.newsbreeze.feature.NewsListAdapter.NewsListViewHolder.Companion Companion = null;
        
        public NewsListViewHolder(@org.jetbrains.annotations.NotNull()
        com.greedygame.newsbreeze.databinding.NewsListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.greedygame.newsbreeze.databinding.NewsListItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.greedygame.newsbreeze.core.data.Article item, @org.jetbrains.annotations.NotNull()
        com.greedygame.newsbreeze.feature.ItemClickListener itemClickListener) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsListAdapter$NewsListViewHolder$Companion;", "", "()V", "getInstance", "Lcom/greedygame/newsbreeze/feature/NewsListAdapter$NewsListViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.greedygame.newsbreeze.feature.NewsListAdapter.NewsListViewHolder getInstance(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/greedygame/newsbreeze/feature/NewsListAdapter$Companion;", "", "()V", "UIMODEL_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/greedygame/newsbreeze/feature/UiModel;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}