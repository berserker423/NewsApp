package com.greedygame.newsbreeze.core.persistance;

import androidx.paging.PagingSource;
import androidx.room.*;
import com.greedygame.newsbreeze.core.data.Article;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000eH\'J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/greedygame/newsbreeze/core/persistance/NewsDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "articles", "", "Lcom/greedygame/newsbreeze/core/data/Article;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newsSource", "Landroidx/paging/PagingSource;", "", "savedNews", "Lkotlinx/coroutines/flow/Flow;", "updateArticle", "isSaved", "", "title", "", "app_debug"})
public abstract interface NewsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from articles ORDER BY publishedAt DESC")
    @androidx.room.Transaction()
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.greedygame.newsbreeze.core.data.Article> newsSource();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from articles WHERE isSaved =1 ORDER BY publishedAt DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.greedygame.newsbreeze.core.data.Article>> savedNews();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM articles WHERE isSaved =0")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Query(value = "UPDATE articles SET isSaved=:isSaved WHERE title = :title")
    public abstract void updateArticle(boolean isSaved, @org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Article> articles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}