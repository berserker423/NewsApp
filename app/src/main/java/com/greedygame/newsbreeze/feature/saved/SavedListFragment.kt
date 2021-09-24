package com.greedygame.newsbreeze.feature.saved

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.coroutineScope
import androidx.paging.ExperimentalPagingApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.greedygame.newsbreeze.R
import com.greedygame.newsbreeze.core.base.BaseFragment
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.core.extension.inTransaction
import com.greedygame.newsbreeze.databinding.FragmentSavedBinding
import com.greedygame.newsbreeze.feature.NewsFragment
import com.greedygame.newsbreeze.feature.NewsViewModel
import com.greedygame.newsbreeze.feature.adapter.ItemCallBack
import com.greedygame.newsbreeze.feature.adapter.SavedListAdapter
import com.greedygame.newsbreeze.feature.detail.NewsDetailFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@ExperimentalPagingApi
@AndroidEntryPoint
class SavedListFragment : BaseFragment<FragmentSavedBinding>(),ItemCallBack {
    val savedListAdapter = SavedListAdapter(this)
    override fun layoutId() = R.layout.fragment_saved


    private val viewModel: SavedListViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        fetchData()

        binding.backBtn.setOnClickListener {
            activity?.onBackPressed()
        }

    }


    fun fetchData(){
        lifecycle.coroutineScope.launch {
           viewModel.getSavedList().collectLatest {
                savedListAdapter.submitList(it)
           }
        }
    }

    fun setupView() {
        binding.recyclerView.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = savedListAdapter
        }
    }

    override fun onItemClick(article: Article) {
        activity?.supportFragmentManager?.inTransaction {
            add(R.id.fragmentContainer, NewsDetailFragment.newInstance(article)).addToBackStack(
                NewsDetailFragment.javaClass.name
            )
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SavedListFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }


}