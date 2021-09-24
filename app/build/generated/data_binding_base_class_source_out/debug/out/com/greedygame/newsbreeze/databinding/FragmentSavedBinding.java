// Generated by data binding compiler. Do not edit!
package com.greedygame.newsbreeze.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.greedygame.newsbreeze.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSavedBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final LinearLayout header;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final EditText searchBar;

  protected FragmentSavedBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backBtn, LinearLayout header, RecyclerView recyclerView, EditText searchBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backBtn = backBtn;
    this.header = header;
    this.recyclerView = recyclerView;
    this.searchBar = searchBar;
  }

  @NonNull
  public static FragmentSavedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_saved, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSavedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSavedBinding>inflateInternal(inflater, R.layout.fragment_saved, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSavedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_saved, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSavedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSavedBinding>inflateInternal(inflater, R.layout.fragment_saved, null, false, component);
  }

  public static FragmentSavedBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSavedBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSavedBinding)bind(component, view, R.layout.fragment_saved);
  }
}
