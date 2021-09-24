package com.greedygame.newsbreeze.core.extension

import android.content.Context
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.greedygame.newsbreeze.R
import com.greedygame.newsbreeze.core.base.BaseActivity
import com.greedygame.newsbreeze.core.base.BaseFragment


inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) =
    beginTransaction().func().commit()

val BaseFragment<*>.viewContainer: View get() = (activity as BaseActivity).findViewById(R.id.fragmentContainer)

val BaseFragment<*>.appContext: Context get() = activity?.applicationContext!!