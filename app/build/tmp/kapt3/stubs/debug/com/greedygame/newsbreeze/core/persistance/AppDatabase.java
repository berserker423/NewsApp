package com.greedygame.newsbreeze.core.persistance;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.core.data.RemoteKeys;

@androidx.room.Database(entities = {com.greedygame.newsbreeze.core.data.Article.class, com.greedygame.newsbreeze.core.data.RemoteKeys.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/greedygame/newsbreeze/core/persistance/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getNewsDao", "Lcom/greedygame/newsbreeze/core/persistance/NewsDao;", "getRemoteKeyDao", "Lcom/greedygame/newsbreeze/core/persistance/RemoteKeyDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.greedygame.newsbreeze.core.persistance.NewsDao getNewsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.greedygame.newsbreeze.core.persistance.RemoteKeyDao getRemoteKeyDao();
}