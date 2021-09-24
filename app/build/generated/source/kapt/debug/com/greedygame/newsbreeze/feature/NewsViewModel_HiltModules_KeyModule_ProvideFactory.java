package com.greedygame.newsbreeze.feature;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static NewsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(NewsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final NewsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new NewsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
