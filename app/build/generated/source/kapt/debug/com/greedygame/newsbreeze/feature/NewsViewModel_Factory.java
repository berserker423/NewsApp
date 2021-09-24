package com.greedygame.newsbreeze.feature;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class NewsViewModel_Factory implements Factory<NewsViewModel> {
  private final Provider<NewsRepo> newsRepoProvider;

  public NewsViewModel_Factory(Provider<NewsRepo> newsRepoProvider) {
    this.newsRepoProvider = newsRepoProvider;
  }

  @Override
  public NewsViewModel get() {
    return newInstance(newsRepoProvider.get());
  }

  public static NewsViewModel_Factory create(Provider<NewsRepo> newsRepoProvider) {
    return new NewsViewModel_Factory(newsRepoProvider);
  }

  public static NewsViewModel newInstance(NewsRepo newsRepo) {
    return new NewsViewModel(newsRepo);
  }
}
