package com.greedygame.newsbreeze.feature;

import com.greedygame.newsbreeze.core.persistance.AppDatabase;
import com.greedygame.newsbreeze.core.service.Service;
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
public final class NewsRepo_Network_Factory implements Factory<NewsRepo.Network> {
  private final Provider<Service> serviceProvider;

  private final Provider<AppDatabase> dbProvider;

  public NewsRepo_Network_Factory(Provider<Service> serviceProvider,
      Provider<AppDatabase> dbProvider) {
    this.serviceProvider = serviceProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public NewsRepo.Network get() {
    return newInstance(serviceProvider.get(), dbProvider.get());
  }

  public static NewsRepo_Network_Factory create(Provider<Service> serviceProvider,
      Provider<AppDatabase> dbProvider) {
    return new NewsRepo_Network_Factory(serviceProvider, dbProvider);
  }

  public static NewsRepo.Network newInstance(Service service, AppDatabase db) {
    return new NewsRepo.Network(service, db);
  }
}
