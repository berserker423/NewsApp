package com.greedygame.newsbreeze.core.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewsData(
    @SerializedName("status")
    var status: String? = null,

    @SerializedName("totalResults")
    var totalResults: Int? = null,

    @SerializedName("articles")
    var articles: List<Article>? = null
)
