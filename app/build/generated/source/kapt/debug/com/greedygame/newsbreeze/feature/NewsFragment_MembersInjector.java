package com.greedygame.newsbreeze.feature;

import com.greedygame.newsbreeze.core.di.MyPreference;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsFragment_MembersInjector implements MembersInjector<NewsFragment> {
  private final Provider<MyPreference> prefProvider;

  public NewsFragment_MembersInjector(Provider<MyPreference> prefProvider) {
    this.prefProvider = prefProvider;
  }

  public static MembersInjector<NewsFragment> create(Provider<MyPreference> prefProvider) {
    return new NewsFragment_MembersInjector(prefProvider);
  }

  @Override
  public void injectMembers(NewsFragment instance) {
    injectPref(instance, prefProvider.get());
  }

  @InjectedFieldSignature("com.greedygame.newsbreeze.feature.NewsFragment.pref")
  public static void injectPref(NewsFragment instance, MyPreference pref) {
    instance.pref = pref;
  }
}
