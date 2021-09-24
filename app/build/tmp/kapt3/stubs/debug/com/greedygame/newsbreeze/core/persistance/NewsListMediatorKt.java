package com.greedygame.newsbreeze.core.persistance;

import android.content.SharedPreferences;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.LoadType;
import androidx.paging.PagingState;
import androidx.paging.RemoteMediator;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.core.data.RemoteKeys;
import com.greedygame.newsbreeze.core.service.Service;
import kotlinx.coroutines.GlobalScope;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"}, d2 = {"DEFAULT_PAGE_INDEX", "", "DEFAULT_PAGE_SIZE", "app_debug"})
public final class NewsListMediatorKt {
    private static final int DEFAULT_PAGE_INDEX = 1;
    public static final int DEFAULT_PAGE_SIZE = 15;
}