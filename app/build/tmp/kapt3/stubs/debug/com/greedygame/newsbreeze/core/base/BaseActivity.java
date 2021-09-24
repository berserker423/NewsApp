package com.greedygame.newsbreeze.core.base;

import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import com.greedygame.newsbreeze.R;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\f\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH&J\b\u0010\t\u001a\u00020\nH%J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u000e"}, d2 = {"Lcom/greedygame/newsbreeze/core/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addFragment", "", "savedInstanceState", "Landroid/os/Bundle;", "fragment", "Lcom/greedygame/newsbreeze/core/base/BaseFragment;", "layoutRes", "", "onBackPressed", "", "onCreate", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public BaseActivity() {
        super();
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int layoutRes();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final java.lang.Object addFragment(android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.greedygame.newsbreeze.core.base.BaseFragment<?> fragment();
}