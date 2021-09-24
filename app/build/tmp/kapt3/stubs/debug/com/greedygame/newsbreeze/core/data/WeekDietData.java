package com.greedygame.newsbreeze.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0087\u0001\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006#"}, d2 = {"Lcom/greedygame/newsbreeze/core/data/WeekDietData;", "", "monday", "", "Lcom/greedygame/newsbreeze/core/data/Meal;", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFriday", "()Ljava/util/List;", "getMonday", "getSaturday", "getSunday", "getThursday", "getTuesday", "getWednesday", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class WeekDietData {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.greedygame.newsbreeze.core.data.Meal> monday = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.greedygame.newsbreeze.core.data.Meal> tuesday = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.greedygame.newsbreeze.core.data.Meal> wednesday = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.greedygame.newsbreeze.core.data.Meal> thursday = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.greedygame.newsbreeze.core.data.Meal> friday = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.greedygame.newsbreeze.core.data.Meal> saturday = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.greedygame.newsbreeze.core.data.Meal> sunday = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.greedygame.newsbreeze.core.data.WeekDietData copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> monday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> tuesday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> wednesday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> thursday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> friday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> saturday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> sunday) {
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
    
    public WeekDietData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> monday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> tuesday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> wednesday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> thursday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> friday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> saturday, @org.jetbrains.annotations.Nullable()
    java.util.List<com.greedygame.newsbreeze.core.data.Meal> sunday) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> getMonday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> getTuesday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> getWednesday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> getThursday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> getFriday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> getSaturday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.greedygame.newsbreeze.core.data.Meal> getSunday() {
        return null;
    }
}