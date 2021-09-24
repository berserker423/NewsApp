package com.greedygame.newsbreeze.core.service;

import com.greedygame.newsbreeze.core.data.Diet;
import com.greedygame.newsbreeze.core.data.NewsData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JQ\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/greedygame/newsbreeze/core/service/Service;", "", "getNewsData", "Lcom/greedygame/newsbreeze/core/data/NewsData;", "q", "", "qInTitle", "sources", "apikey", "page", "", "pageSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Service {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "everything")
    public abstract java.lang.Object getNewsData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "qInTitle")
    java.lang.String qInTitle, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sources")
    java.lang.String sources, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apikey, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "pageSize")
    int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.greedygame.newsbreeze.core.data.NewsData> continuation);
}