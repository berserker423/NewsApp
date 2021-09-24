package com.greedygame.newsbreeze.feature

import android.content.Context
import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.core.persistance.AppDatabase
import com.greedygame.newsbreeze.core.persistance.DEFAULT_PAGE_SIZE
import com.greedygame.newsbreeze.core.persistance.NewsListMediator
import com.greedygame.newsbreeze.core.service.Service
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ExperimentalPagingApi
interface NewsRepo {
    fun getSearchResultStream(query: String): Flow<PagingData<Article>>

    fun getSavedNewsDB(): Flow<List<Article>>

    fun updateArticle(isSaved : Boolean, title :String)

    class Network
    @Inject constructor(
        private val service: Service,
        private val db: AppDatabase
    ) : NewsRepo {

        private fun getDefaultPageConfig(): PagingConfig {
            return PagingConfig(pageSize = DEFAULT_PAGE_SIZE, enablePlaceholders = true)
        }

        override fun getSearchResultStream(query: String): Flow<PagingData<Article>> {
            val pagingSourceFactory = { db.getNewsDao().newsSource() }
            return Pager(
                config = getDefaultPageConfig(),
                pagingSourceFactory = pagingSourceFactory,
                remoteMediator = NewsListMediator(service = service, db = db, query)
            ).flow
        }

        override fun getSavedNewsDB() = db.getNewsDao().savedNews()
        override fun updateArticle(isSaved : Boolean, title: String) = db.getNewsDao().updateArticle(isSaved,title)


    }

}