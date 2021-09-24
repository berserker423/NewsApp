package com.greedygame.newsbreeze.core.di;

import com.greedygame.newsbreeze.core.service.Service;
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
public final class ApplicationModule_ProvideServiceFactory implements Factory<Service> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideServiceFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Service get() {
    return provideService(module);
  }

  public static ApplicationModule_ProvideServiceFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideServiceFactory(module);
  }

  public static Service provideService(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideService());
  }
}
