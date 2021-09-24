package com.greedygame.newsbreeze.core.di;

import android.content.Context;
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
public final class MyPreference_Factory implements Factory<MyPreference> {
  private final Provider<Context> contextProvider;

  public MyPreference_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MyPreference get() {
    return newInstance(contextProvider.get());
  }

  public static MyPreference_Factory create(Provider<Context> contextProvider) {
    return new MyPreference_Factory(contextProvider);
  }

  public static MyPreference newInstance(Context context) {
    return new MyPreference(context);
  }
}
