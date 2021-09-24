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

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"PAGE_SIZE", "", "setLayoutMarginTop", "", "view", "Landroid/view/View;", "dimen", "", "app_debug"})
public final class NewsListAdapterKt {
    public static final int PAGE_SIZE = 10;
    
    @androidx.databinding.BindingAdapter(value = {"layoutMarginTop"})
    public static final void setLayoutMarginTop(@org.jetbrains.annotations.NotNull()
    android.view.View view, float dimen) {
    }
}