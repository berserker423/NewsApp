package com.greedygame.newsbreeze.feature;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Toast;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.greedygame.newsbreeze.R;
import com.greedygame.newsbreeze.core.base.BaseFragment;
import com.greedygame.newsbreeze.core.data.Article;
import com.greedygame.newsbreeze.core.di.MyPreference;
import com.greedygame.newsbreeze.databinding.FragmentNewsBinding;
import com.greedygame.newsbreeze.feature.adapter.ListLoadStateAdapter;
import com.greedygame.newsbreeze.feature.detail.NewsDetailFragment;
import com.greedygame.newsbreeze.feature.saved.SavedListFragment;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.flow.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"SEARCH_QUERY", "", "app_debug"})
public final class NewsFragmentKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_QUERY = "SEARCH_QUERY";
}