package com.greedygame.newsbreeze.feature

import android.content.SharedPreferences
import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.greedygame.newsbreeze.R
import com.greedygame.newsbreeze.core.base.BaseFragment
import com.greedygame.newsbreeze.core.data.Article
import com.greedygame.newsbreeze.core.di.MyPreference
import com.greedygame.newsbreeze.core.extension.inTransaction
import com.greedygame.newsbreeze.core.extension.invisible
import com.greedygame.newsbreeze.core.extension.visible
import com.greedygame.newsbreeze.databinding.FragmentNewsBinding
import com.greedygame.newsbreeze.feature.adapter.ListLoadStateAdapter
import com.greedygame.newsbreeze.feature.detail.NewsDetailFragment
import com.greedygame.newsbreeze.feature.saved.SavedListFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

const val SEARCH_QUERY = "SEARCH_QUERY"


@ExperimentalPagingApi
@AndroidEntryPoint
class NewsFragment : BaseFragment<FragmentNewsBinding>(), ItemClickListener {

    @Inject
    lateinit var pref: MyPreference
    private val viewModel: NewsViewModel by viewModels()
    private val adapter = NewsListAdapter(this)
    private var searchJob: Job? = null

    companion object {
        @JvmStatic
        fun newInstance() =
            NewsFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun layoutId() = R.layout.fragment_news

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        initAdapter()
        if (pref.getStoredTag(SEARCH_QUERY).isNotEmpty()) {
            search(pref.getStoredTag(SEARCH_QUERY))
        } else {
            search()
        }
        initSearch()
        binding.retryButton.setOnClickListener { adapter.retry() }
        binding.savedItems.setOnClickListener {
            activity?.supportFragmentManager?.inTransaction {
                add(R.id.fragmentContainer, SavedListFragment.newInstance()).addToBackStack(
                    SavedListFragment.javaClass.name
                )
            }
        }

    }

    fun setupView() {
        binding.recyclerView.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = adapter
        }
    }


    private fun initAdapter() {
        //setting up load state adapter
        binding.recyclerView.adapter = adapter.withLoadStateHeaderAndFooter(
            header = ListLoadStateAdapter { adapter.retry() },
            footer = ListLoadStateAdapter { adapter.retry() }
        )
        adapter.addLoadStateListener { loadState ->
            val isListEmpty = loadState.refresh is LoadState.NotLoading && adapter.itemCount == 0
            showEmptyList(isListEmpty)

            // Only show the list if refresh succeeds.
            binding.recyclerView.isVisible = loadState.source.refresh is LoadState.NotLoading
            // Show loading spinner during initial load or refresh.
            binding.progressBar.isVisible = loadState.source.refresh is LoadState.Loading
            // Show the retry state if initial load or refresh fails.
            binding.retryButton.isVisible = loadState.source.refresh is LoadState.Error

            // Toast on any error,
            val errorState = loadState.source.append as? LoadState.Error
                ?: loadState.source.prepend as? LoadState.Error
                ?: loadState.append as? LoadState.Error
                ?: loadState.prepend as? LoadState.Error
            errorState?.let {
                Toast.makeText(
                    requireContext(),
                    "\uD83D\uDE28 Wooops ${it.error}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    //search according to input string
    private fun initSearch() {
        binding.searchBar.setText(pref.getStoredTag(SEARCH_QUERY))
        binding.searchBar.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_GO) {
                updateRepoListFromInput()

                true
            } else {
                false
            }
        }
        binding.searchBar.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                updateRepoListFromInput()
                true
            } else {
                false
            }
        }

        // Scroll to top when the list is refreshed from network.
        lifecycleScope.launch {
            adapter.loadStateFlow
                // Only emit when REFRESH LoadState for RemoteMediator changes.
                .distinctUntilChangedBy { it.refresh }
                // Only react to cases where Remote REFRESH completes i.e., NotLoading.
                .filter { it.refresh is LoadState.NotLoading }
                .collect { binding.recyclerView.scrollToPosition(0) }

        }
    }


    private fun updateRepoListFromInput() {
        binding.searchBar.text.trim().let {
            if (it.isNotEmpty()) {
                pref.setStoredTag(SEARCH_QUERY, it.toString())
                search(it.toString())
            }
        }
    }

    private fun showEmptyList(show: Boolean) {
        if (show) {
            binding.recyclerView.invisible()
        } else {
            binding.recyclerView.visible()
        }
    }

    private fun search(query: String = "news") {
        // Make sure we cancel the previous job before creating a new one
        searchJob?.cancel()
        searchJob = lifecycleScope.launch {
            viewModel.searchNews(query).collectLatest {
                adapter.submitData(it)
            }
        }
    }


    override fun onSave(article: Article) {
        val snapshotArticle = adapter.snapshot().firstOrNull { snapshotArticle ->
            when (snapshotArticle) {
                is UiModel.ArticleItem -> snapshotArticle.article.title == article.title
                is UiModel.SeparatorItem -> false
                else -> false
            }
        }

        if (snapshotArticle != null) {
            (snapshotArticle as UiModel.ArticleItem).article.apply {
                viewModel.updateArticle(!isSaved,this.title)
            }

//            adapter.notifyDataSetChanged()
        }
    }

    override fun onItemClick(article: Article) {
        activity?.supportFragmentManager?.inTransaction {
            add(R.id.fragmentContainer, NewsDetailFragment.newInstance(article)).addToBackStack(
                NewsDetailFragment.javaClass.name
            )
        }
    }


}