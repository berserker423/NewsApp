package com.greedygame.newsbreeze.feature.saved;

import com.greedygame.newsbreeze.feature.NewsRepo;
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
public final class SavedListViewModel_Factory implements Factory<SavedListViewModel> {
  private final Provider<NewsRepo> newsRepoProvider;

  public SavedListViewModel_Factory(Provider<NewsRepo> newsRepoProvider) {
    this.newsRepoProvider = newsRepoProvider;
  }

  @Override
  public SavedListViewModel get() {
    return newInstance(newsRepoProvider.get());
  }

  public static SavedListViewModel_Factory create(Provider<NewsRepo> newsRepoProvider) {
    return new SavedListViewModel_Factory(newsRepoProvider);
  }

  public static SavedListViewModel newInstance(NewsRepo newsRepo) {
    return new SavedListViewModel(newsRepo);
  }
}
