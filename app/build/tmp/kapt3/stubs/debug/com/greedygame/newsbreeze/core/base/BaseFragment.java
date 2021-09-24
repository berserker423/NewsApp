package com.greedygame.newsbreeze.core.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import com.greedygame.newsbreeze.R;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000\u00a2\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u0013H%J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\b\u0017J/\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000\u00a2\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u0010H\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0013H\u0002J\r\u0010\'\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b(R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006)"}, d2 = {"Lcom/greedygame/newsbreeze/core/base/BaseFragment;", "VB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Landroidx/databinding/ViewDataBinding;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "firstTimeCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "firstTimeCreated$app_debug", "hideProgress", "", "hideProgress$app_debug", "layoutId", "", "notify", "message", "", "notify$app_debug", "notifyWithAction", "actionText", "action", "Lkotlin/Function0;", "", "notifyWithAction$app_debug", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "progressStatus", "viewStatus", "showProgress", "showProgress$app_debug", "app_debug"})
public abstract class BaseFragment<VB extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    private VB _binding;
    
    public BaseFragment() {
        super();
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int layoutId();
    
    @org.jetbrains.annotations.NotNull()
    public final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public void onBackPressed() {
    }
    
    public final boolean firstTimeCreated$app_debug(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return false;
    }
    
    public final void showProgress$app_debug() {
    }
    
    public final void hideProgress$app_debug() {
    }
    
    private final void progressStatus(int viewStatus) {
    }
    
    public final void notify$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void notifyWithAction$app_debug(@androidx.annotation.StringRes()
    int message, @androidx.annotation.StringRes()
    int actionText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.lang.Object> action) {
    }
}