package com.greedygame.newsbreeze.feature

import android.icu.text.CaseMap
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.*
import com.greedygame.newsbreeze.core.data.Article
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@ExperimentalPagingApi
@HiltViewModel
class NewsViewModel
@Inject constructor(val newsRepo: NewsRepo) : ViewModel() {

    private var currentQueryValue: String? = null
    private var currentSearchResult: Flow<PagingData<UiModel>>? = null

    fun searchNews(queryString: String): Flow<PagingData<UiModel>> {
        val lastResult = currentSearchResult
        if (queryString == currentQueryValue && lastResult != null) {
            return lastResult
        }
        currentQueryValue = queryString
        val newResult: Flow<PagingData<UiModel>> =
            newsRepo.getSearchResultStream(queryString)
                .map { pagingData ->
                    pagingData.map { UiModel.ArticleItem(it) }
                }
                .map {
                    it.insertSeparators<UiModel.ArticleItem, UiModel> { before, after ->
                        when {
                            before == null -> null
                            after == null -> null
                            else ->  UiModel.SeparatorItem()
                        }
                    }
                }
                .cachedIn(viewModelScope)
        currentSearchResult = newResult
        return newResult
    }

    fun updateArticle(isSaved : Boolean,title : String)  {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                newsRepo.updateArticle(isSaved,title)
            }
        }
    }
}


sealed class UiModel {
    data class ArticleItem(val article: Article) : UiModel()
    class SeparatorItem() : UiModel()
}