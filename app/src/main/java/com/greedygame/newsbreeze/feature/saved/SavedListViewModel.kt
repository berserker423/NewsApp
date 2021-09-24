package com.greedygame.newsbreeze.feature.saved

import androidx.lifecycle.ViewModel
import androidx.paging.ExperimentalPagingApi
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.feature.NewsRepo
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ExperimentalPagingApi
@HiltViewModel
class SavedListViewModel
@Inject constructor(val newsRepo: NewsRepo) : ViewModel() {


     fun getSavedList() : Flow<List<Article>> = newsRepo.getSavedNewsDB()

}