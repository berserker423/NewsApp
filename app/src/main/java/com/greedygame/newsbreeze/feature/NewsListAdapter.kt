package com.greedygame.newsbreeze.feature

import com.greedygame.newsbreeze.core.data.Article
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.greedygame.newsbreeze.R
import com.greedygame.newsbreeze.core.extension.invisible
import com.greedygame.newsbreeze.core.extension.visible
import com.greedygame.newsbreeze.databinding.NewsListItemBinding
import com.greedygame.newsbreeze.feature.adapter.SeparatorViewHolder


@BindingAdapter("layoutMarginTop")
fun setLayoutMarginTop(view: View, dimen: Float) {
    val layoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
    layoutParams.topMargin = dimen.toInt()
    view.layoutParams = layoutParams
}

const val PAGE_SIZE = 10

class NewsListAdapter(private val itemClickListener: ItemClickListener) :
    PagingDataAdapter<UiModel, RecyclerView.ViewHolder>(UIMODEL_COMPARATOR) {
    companion object {
        private val UIMODEL_COMPARATOR = object : DiffUtil.ItemCallback<UiModel>() {
            override fun areItemsTheSame(oldItem: UiModel, newItem: UiModel): Boolean {
                return (oldItem is UiModel.ArticleItem && newItem is UiModel.ArticleItem &&
                        oldItem.article.source!!.sourceId == newItem.article.source!!.sourceId)
            }

            override fun areContentsTheSame(oldItem: UiModel, newItem: UiModel): Boolean =
                oldItem == newItem
        }
    }

    class NewsListViewHolder(val binding: NewsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun getInstance(parent: ViewGroup): NewsListViewHolder {
                val binding =
                    NewsListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return NewsListViewHolder(binding)
            }
        }

        fun bind(item: Article, itemClickListener: ItemClickListener) {
            binding.saveBtn.setOnClickListener {
                itemClickListener.onSave(article = item)
            }
            if(item.isSaved){
                binding.bookmarkBtn.setCardBackgroundColor(ContextCompat.getColor(itemView.context, R.color.green))
            }else{
                binding.bookmarkBtn.setCardBackgroundColor(ContextCompat.getColor(itemView.context, R.color.deep_grey))
            }
            item.urlToImage?.let {
                Glide.with(itemView.context).load(it).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(binding.image)
            }
            item.title?.let {
                binding.title.text = it
            }


            item.description?.let {
                binding.description.text = it
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == R.layout.separator_news_item) {
            SeparatorViewHolder.create(parent)
        } else {
            NewsListViewHolder.getInstance(parent)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is UiModel.ArticleItem -> R.layout.news_list_item
            is UiModel.SeparatorItem -> R.layout.separator_news_item
            null -> throw UnsupportedOperationException("Unknown view")
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val uiModel = getItem(position)
        uiModel.let {
            when (uiModel) {
                is UiModel.ArticleItem -> {
                    (holder as NewsListViewHolder).apply {
                        bind(uiModel.article, itemClickListener)
                        itemView.setOnClickListener {
                            itemClickListener.onItemClick(uiModel.article)
                        }
                        if (position == 0) {
                            binding.separatorView.visible()
                            binding.isFirstItem = true
                        } else {
                            binding.separatorView.invisible()
                            binding.isFirstItem = false
                        }
                    }
                }
                is UiModel.SeparatorItem -> (holder as SeparatorViewHolder).bind()

                else -> null
            }
        }
    }






}

interface ItemClickListener {
    fun onSave(article: Article)
    fun onItemClick(article: Article)
}