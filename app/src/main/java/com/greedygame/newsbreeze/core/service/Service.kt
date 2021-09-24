package com.greedygame.newsbreeze.core.service

import com.greedygame.newsbreeze.core.data.Diet
import com.greedygame.newsbreeze.core.data.NewsData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {
    @GET("everything")
    suspend fun getNewsData(
        @Query("q") q : String,
        @Query("qInTitle") qInTitle : String,
        @Query("sources") sources : String,
        @Query("apiKey") apikey: String?,
        @Query("page") page : Int,
        @Query("pageSize") pageSize : Int
    ): NewsData?
}