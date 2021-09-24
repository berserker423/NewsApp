package com.greedygame.newsbreeze.core.di;

import com.greedygame.newsbreeze.feature.NewsRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ApplicationModule_ProvideNewsRepoFactory implements Factory<NewsRepo> {
  private final ApplicationModule module;

  private final Provider<NewsRepo.Network> newsRepoProvider;

  public ApplicationModule_ProvideNewsRepoFactory(ApplicationModule module,
      Provider<NewsRepo.Network> newsRepoProvider) {
    this.module = module;
    this.newsRepoProvider = newsRepoProvider;
  }

  @Override
  public NewsRepo get() {
    return provideNewsRepo(module, newsRepoProvider.get());
  }

  public static ApplicationModule_ProvideNewsRepoFactory create(ApplicationModule module,
      Provider<NewsRepo.Network> newsRepoProvider) {
    return new ApplicationModule_ProvideNewsRepoFactory(module, newsRepoProvider);
  }

  public static NewsRepo provideNewsRepo(ApplicationModule instance, NewsRepo.Network newsRepo) {
    return Preconditions.checkNotNullFromProvides(instance.provideNewsRepo(newsRepo));
  }
}
