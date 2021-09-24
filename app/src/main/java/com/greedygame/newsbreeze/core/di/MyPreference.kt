package com.greedygame.newsbreeze.core.di

import android.content.Context
import android.preference.PreferenceManager
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyPreference @Inject constructor(@ApplicationContext context : Context){
    val prefs = context.getSharedPreferences(context.packageName + "_preferences", Context.MODE_PRIVATE)

    fun getStoredTag(tag : String): String {
        return prefs.getString(tag, "")!!
    }
    fun setStoredTag(tag : String , query: String) {
        prefs.edit().putString(tag, query).apply()
    }

    fun setBooleanTag(tag : String , binary : Boolean) {
        prefs.edit().putBoolean(tag, binary).apply()
    }

    fun getBooleanTag(tag : String ) = prefs.getBoolean(tag,false)
}