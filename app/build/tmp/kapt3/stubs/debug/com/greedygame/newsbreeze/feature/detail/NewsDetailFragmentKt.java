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

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"ARTICLE", "", "app_debug"})
public final class NewsDetailFragmentKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE = "Article";
}