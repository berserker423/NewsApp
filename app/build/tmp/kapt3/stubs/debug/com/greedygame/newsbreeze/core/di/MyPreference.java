package com.greedygame.newsbreeze.core.di;

import android.content.Context;
import android.preference.PreferenceManager;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rR\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/greedygame/newsbreeze/core/di/MyPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "getBooleanTag", "", "tag", "", "getStoredTag", "setBooleanTag", "", "binary", "setStoredTag", "query", "app_debug"})
@javax.inject.Singleton()
public final class MyPreference {
    private final android.content.SharedPreferences prefs = null;
    
    @javax.inject.Inject()
    public MyPreference(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    public final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStoredTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return null;
    }
    
    public final void setStoredTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void setBooleanTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean binary) {
    }
    
    public final boolean getBooleanTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return false;
    }
}