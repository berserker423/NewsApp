package com.greedygame.newsbreeze.core.data

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Source (
    @SerializedName("id")
    @Expose
    val sourceId: String? = null ,

    @SerializedName("name")
    @Expose
    val name: String? = null
) : Parcelable