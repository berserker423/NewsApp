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

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/greedygame/newsbreeze/feature/ItemClickListener;", "", "onItemClick", "", "article", "Lcom/greedygame/newsbreeze/core/data/Article;", "onSave", "app_debug"})
public abstract interface ItemClickListener {
    
    public abstract void onSave(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.data.Article article);
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.data.Article article);
}