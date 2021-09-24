package com.greedygame.newsbreeze.feature.detail
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.paging.ExperimentalPagingApi
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.greedygame.newsbreeze.R
import com.greedygame.newsbreeze.core.base.BaseFragment
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.databinding.FragmentNewsDetailBinding
import com.greedygame.newsbreeze.feature.NewsViewModel
import com.greedygame.newsbreeze.feature.UiModel
import dagger.hilt.android.AndroidEntryPoint


const val ARTICLE = "Article"
@ExperimentalPagingApi
@AndroidEntryPoint
class NewsDetailFragment : BaseFragment<FragmentNewsDetailBinding>(){
    override fun layoutId() = R.layout.fragment_news_detail


    val viewModel: NewsViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val article = arguments?.getParcelable<Article>(ARTICLE)
        article?.let {
            initView(article)
            binding.saveBtn.setOnClickListener {
                viewModel.updateArticle(!article.isSaved,article.title)
            }
        }


        binding.backBtn.setOnClickListener {
           activity?.onBackPressed()
        }

    }

    companion object {
        @JvmStatic
        fun newInstance(article: Article) =
            NewsDetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARTICLE,article)
                }
            }
    }

    private fun initView(article: Article) {
        binding.backBtn.setOnClickListener { v -> onBackPressed() }
        article.urlToImage?.let {
            Glide.with(this).load(it).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(binding.image)
        }

       article.title.let {
           binding.title.setText(it)
       }


        article.author?.let {
            binding.author.setText(it)
        }

        article.content?.let {
            binding.content.setText(it)
        }
    }


}