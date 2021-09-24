package com.greedygame.newsbreeze.feature


import androidx.paging.ExperimentalPagingApi
import com.greedygame.newsbreeze.R
import com.greedygame.newsbreeze.core.base.BaseActivity

@ExperimentalPagingApi
class NewsActivity : BaseActivity() {
    override fun layoutRes() = R.layout.activity_layout



    override fun fragment() = NewsFragment.newInstance()
}