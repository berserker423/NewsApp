package com.greedygame.newsbreeze.feature.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.databinding.NewsListItemBinding
import com.greedygame.newsbreeze.databinding.SavedNewsListItemBinding
import com.greedygame.newsbreeze.feature.ItemClickListener

class SavedListAdapter(private val itemCallBack: ItemCallBack) : ListAdapter<Article,SavedListAdapter.ViewHolder>(REPO_COMPARATOR) {
    class ViewHolder(val binding: SavedNewsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun getInstance(parent: ViewGroup): ViewHolder {
                val binding =
                   SavedNewsListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolder(binding)
            }
        }

        fun bind(item: Article, itemCallBack: ItemCallBack) {
            itemView.setOnClickListener {
                itemCallBack.onItemClick(item)
            }
            item.urlToImage?.let {
                Glide.with(itemView.context).load(it).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(binding.image)
            }
            item.title?.let {
                binding.title.text = it
            }

        }
    }

    companion object {
        private val REPO_COMPARATOR = object : DiffUtil.ItemCallback<Article>() {
            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.id == newItem.id
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
              return oldItem== newItem
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.getInstance(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position),itemCallBack)
    }


    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
}


interface ItemCallBack {
    fun onItemClick(friend: Article)
}