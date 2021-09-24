package com.greedygame.newsbreeze.core.persistance

import androidx.paging.PagingSource
import androidx.room.*
import com.greedygame.newsbreeze.core.data.Article
import kotlinx.coroutines.flow.Flow

@Dao
interface NewsDao {
    @Transaction
    @Query("SELECT * from articles ORDER BY publishedAt DESC")
    fun newsSource(): PagingSource<Int,Article>

    @Query("SELECT * from articles WHERE isSaved =1 ORDER BY publishedAt DESC")
    fun savedNews(): Flow<List<Article>>

    @Query("DELETE FROM articles WHERE isSaved =0")
    suspend fun deleteAll()


    @Query("UPDATE articles SET isSaved=:isSaved WHERE title = :title")
    fun updateArticle(isSaved : Boolean, title : String)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(articles : List<Article?>?)
}