package com.greedygame.newsbreeze.core.persistance

import android.content.SharedPreferences
import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.core.data.RemoteKeys
import com.greedygame.newsbreeze.core.service.Service
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

private const val DEFAULT_PAGE_INDEX = 1
const val DEFAULT_PAGE_SIZE = 15


@OptIn(ExperimentalPagingApi::class)
class NewsListMediator(
    private val service: Service,
    private val db: AppDatabase,
    private val query : String
) : RemoteMediator<Int, Article>() {

    private val COUNTRY_CODE = "in"
    override suspend fun initialize(): InitializeAction {
        // Launch remote refresh as soon as paging starts and do not trigger remote prepend or
        // append until refresh has succeeded. In cases where we don't mind showing out-of-date,
        // cached offline data, we can return SKIP_INITIAL_REFRESH instead to prevent paging
        // triggering remote refresh.
        return InitializeAction.LAUNCH_INITIAL_REFRESH
    }

    override suspend fun load(loadType: LoadType, state: PagingState<Int, Article>): MediatorResult {

        val page = when (loadType) {
            LoadType.REFRESH -> {
                val remoteKeys = getRemoteKeyClosestToCurrentPosition(state)
                remoteKeys?.nextKey?.minus(1) ?: DEFAULT_PAGE_INDEX
            }
            LoadType.PREPEND -> {
                val remoteKeys = getRemoteKeyForFirstItem(state)
                // If the previous key is null, then the list is empty so we should wait for data
                // fetched by remote refresh and can simply skip loading this time by returning
                // `false` for endOfPaginationReached.
                val prevKey = remoteKeys?.prevKey
                if (prevKey == null) {
                    return MediatorResult.Success(endOfPaginationReached = false)
                }
                prevKey
            }
            LoadType.APPEND -> {
                val remoteKeys = getRemoteKeyForLastItem(state)
                // If the next key is null, then the list is empty so we should wait for data
                // fetched by remote refresh and can simply skip loading this time by returning
                // `false` for endOfPaginationReached.
                val nextKey = remoteKeys?.nextKey
                if (nextKey == null) {
                    return MediatorResult.Success(endOfPaginationReached = false)
                }
                nextKey
            }
        }


        try {
            val newsResponse = service.getNewsData("",query,"","e84785793d1a49c5a4b051c4a2aaac0c", page, DEFAULT_PAGE_SIZE)
            val isEndOfList = newsResponse?.articles?.isEmpty()
            db.withTransaction {
                // clear all tables in the database
                if (loadType == LoadType.REFRESH) {
                    db.getRemoteKeyDao().clearRemoteKeys()
                    db.getNewsDao().deleteAll()
                }
                val prevKey = if (page == DEFAULT_PAGE_INDEX) null else page - 1
                val nextKey = if (isEndOfList!!) null else page + 1
                val keys = newsResponse.articles?.map {
                    RemoteKeys(repoId = it.title.toString(), prevKey = prevKey, nextKey = nextKey)
                }
                db.getRemoteKeyDao().insertAll(keys!!)
                db.getNewsDao().insertAll(newsResponse.articles)
            }
            return MediatorResult.Success(endOfPaginationReached = isEndOfList!!)
        } catch (exception: IOException) {
            return MediatorResult.Error(exception)
        } catch (exception: HttpException) {
            return MediatorResult.Error(exception)
        }
    }

   private suspend fun getRemoteKeyForLastItem(state: PagingState<Int, Article>): RemoteKeys? {
        // Get the last page that was retrieved, that contained items.
        // From that last page, get the last item
        return state.pages.lastOrNull() { it.data.isNotEmpty() }?.data?.lastOrNull()
                ?.let { repo ->
                    // Get the remote keys of the last item retrieved
                    db.getRemoteKeyDao().remoteKeysId(repo.id)
                }
    }

   private suspend fun getRemoteKeyForFirstItem(state: PagingState<Int, Article>): RemoteKeys? {
        // Get the first page that was retrieved, that contained items.
        // From that first page, get the first item
        return state.pages.firstOrNull { it.data.isNotEmpty() }?.data?.firstOrNull()
                ?.let { repo ->
                    // Get the remote keys of the first items retrieved
                    db.getRemoteKeyDao().remoteKeysId(repo.id)
                }
    }

    private suspend fun getRemoteKeyClosestToCurrentPosition(
            state: PagingState<Int, Article>
    ): RemoteKeys? {
        // The paging library is trying to load data after the anchor position
        // Get the item closest to the anchor position
        return state.anchorPosition?.let { position ->
            state.closestItemToPosition(position)?.id?.let { repoId ->
                db.getRemoteKeyDao().remoteKeysId(repoId)
            }
        }
    }
}
