package com.greedygame.newsbreeze.feature.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.greedygame.newsbreeze.R
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.databinding.SeparatorNewsItemBinding

class SeparatorViewHolder(val binding: SeparatorNewsItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind() {
    }

    companion object {
        fun create(parent: ViewGroup): SeparatorViewHolder {
            val binding: SeparatorNewsItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.separator_news_item,
                parent,
                false
            )
            return SeparatorViewHolder(binding)
        }
    }
}