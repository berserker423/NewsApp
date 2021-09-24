package com.greedygame.newsbreeze.feature;

import android.icu.text.CaseMap;
import androidx.lifecycle.ViewModel;
import androidx.paging.*;
import com.greedygame.newsbreeze.core.data.Article;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/greedygame/newsbreeze/feature/UiModel;", "", "()V", "ArticleItem", "SeparatorItem", "Lcom/greedygame/newsbreeze/feature/UiModel$ArticleItem;", "Lcom/greedygame/newsbreeze/feature/UiModel$SeparatorItem;", "app_debug"})
public abstract class UiModel {
    
    private UiModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/greedygame/newsbreeze/feature/UiModel$ArticleItem;", "Lcom/greedygame/newsbreeze/feature/UiModel;", "article", "Lcom/greedygame/newsbreeze/core/data/Article;", "(Lcom/greedygame/newsbreeze/core/data/Article;)V", "getArticle", "()Lcom/greedygame/newsbreeze/core/data/Article;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ArticleItem extends com.greedygame.newsbreeze.feature.UiModel {
        @org.jetbrains.annotations.NotNull()
        private final com.greedygame.newsbreeze.core.data.Article article = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.greedygame.newsbreeze.feature.UiModel.ArticleItem copy(@org.jetbrains.annotations.NotNull()
        com.greedygame.newsbreeze.core.data.Article article) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ArticleItem(@org.jetbrains.annotations.NotNull()
        com.greedygame.newsbreeze.core.data.Article article) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.greedygame.newsbreeze.core.data.Article component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.greedygame.newsbreeze.core.data.Article getArticle() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/greedygame/newsbreeze/feature/UiModel$SeparatorItem;", "Lcom/greedygame/newsbreeze/feature/UiModel;", "()V", "app_debug"})
    public static final class SeparatorItem extends com.greedygame.newsbreeze.feature.UiModel {
        
        public SeparatorItem() {
            super();
        }
    }
}