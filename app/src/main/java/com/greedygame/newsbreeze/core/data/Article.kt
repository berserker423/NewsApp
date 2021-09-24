package com.greedygame.newsbreeze.core.data

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Entity(tableName = "articles")
@Parcelize
data class Article(
    val id : Int,
    @SerializedName("source")
    @Embedded
    val source: Source?,

    @SerializedName("author")
    val author: String?,

    @SerializedName("title")
    @PrimaryKey
    val title: String,

    @SerializedName("description")
    val description: String?,

    @SerializedName("url")
    val url: String?,

    @SerializedName("urlToImage")
    val urlToImage: String?,

    @SerializedName("publishedAt")
    val publishedAt: String?,

    @SerializedName("content")
    val content: String?,

    val bookmarkStatus: String?,
    var isSaved: Boolean = false
) : Parcelable