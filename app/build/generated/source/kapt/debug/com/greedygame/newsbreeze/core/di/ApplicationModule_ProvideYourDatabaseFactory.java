package com.greedygame.newsbreeze.core.di;

import android.content.Context;
import com.greedygame.newsbreeze.core.persistance.AppDatabase;
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
public final class ApplicationModule_ProvideYourDatabaseFactory implements Factory<AppDatabase> {
  private final ApplicationModule module;

  private final Provider<Context> appProvider;

  public ApplicationModule_ProvideYourDatabaseFactory(ApplicationModule module,
      Provider<Context> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public AppDatabase get() {
    return provideYourDatabase(module, appProvider.get());
  }

  public static ApplicationModule_ProvideYourDatabaseFactory create(ApplicationModule module,
      Provider<Context> appProvider) {
    return new ApplicationModule_ProvideYourDatabaseFactory(module, appProvider);
  }

  public static AppDatabase provideYourDatabase(ApplicationModule instance, Context app) {
    return Preconditions.checkNotNullFromProvides(instance.provideYourDatabase(app));
  }
}
