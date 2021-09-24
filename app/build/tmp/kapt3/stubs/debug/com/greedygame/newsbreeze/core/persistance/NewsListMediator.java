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

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\'\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u000b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/greedygame/newsbreeze/core/persistance/NewsListMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/greedygame/newsbreeze/core/data/Article;", "service", "Lcom/greedygame/newsbreeze/core/service/Service;", "db", "Lcom/greedygame/newsbreeze/core/persistance/AppDatabase;", "query", "", "(Lcom/greedygame/newsbreeze/core/service/Service;Lcom/greedygame/newsbreeze/core/persistance/AppDatabase;Ljava/lang/String;)V", "COUNTRY_CODE", "getRemoteKeyClosestToCurrentPosition", "Lcom/greedygame/newsbreeze/core/data/RemoteKeys;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteKeyForFirstItem", "getRemoteKeyForLastItem", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsListMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.greedygame.newsbreeze.core.data.Article> {
    private final com.greedygame.newsbreeze.core.service.Service service = null;
    private final com.greedygame.newsbreeze.core.persistance.AppDatabase db = null;
    private final java.lang.String query = null;
    private final java.lang.String COUNTRY_CODE = "in";
    
    public NewsListMediator(@org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.service.Service service, @org.jetbrains.annotations.NotNull()
    com.greedygame.newsbreeze.core.persistance.AppDatabase db, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object initialize(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.InitializeAction> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.greedygame.newsbreeze.core.data.Article> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyForLastItem(androidx.paging.PagingState<java.lang.Integer, com.greedygame.newsbreeze.core.data.Article> state, kotlin.coroutines.Continuation<? super com.greedygame.newsbreeze.core.data.RemoteKeys> continuation) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyForFirstItem(androidx.paging.PagingState<java.lang.Integer, com.greedygame.newsbreeze.core.data.Article> state, kotlin.coroutines.Continuation<? super com.greedygame.newsbreeze.core.data.RemoteKeys> continuation) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyClosestToCurrentPosition(androidx.paging.PagingState<java.lang.Integer, com.greedygame.newsbreeze.core.data.Article> state, kotlin.coroutines.Continuation<? super com.greedygame.newsbreeze.core.data.RemoteKeys> continuation) {
        return null;
    }
}