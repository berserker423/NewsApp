package com.greedygame.newsbreeze.core.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.core.data.RemoteKeys

@Database(
    entities = [Article::class,RemoteKeys::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getNewsDao() : NewsDao
    abstract fun getRemoteKeyDao() : RemoteKeyDao
}