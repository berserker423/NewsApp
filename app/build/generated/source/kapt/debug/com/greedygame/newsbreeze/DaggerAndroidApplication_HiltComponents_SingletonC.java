package com.greedygame.newsbreeze;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.greedygame.newsbreeze.core.base.BaseActivity;
import com.greedygame.newsbreeze.core.di.ApplicationModule;
import com.greedygame.newsbreeze.core.di.ApplicationModule_ProvideNewsRepoFactory;
import com.greedygame.newsbreeze.core.di.ApplicationModule_ProvideServiceFactory;
import com.greedygame.newsbreeze.core.di.ApplicationModule_ProvideYourDatabaseFactory;
import com.greedygame.newsbreeze.core.di.MyPreference;
import com.greedygame.newsbreeze.core.persistance.AppDatabase;
import com.greedygame.newsbreeze.core.service.Service;
import com.greedygame.newsbreeze.feature.NewsFragment;
import com.greedygame.newsbreeze.feature.NewsFragment_MembersInjector;
import com.greedygame.newsbreeze.feature.NewsRepo;
import com.greedygame.newsbreeze.feature.NewsViewModel;
import com.greedygame.newsbreeze.feature.NewsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.greedygame.newsbreeze.feature.detail.NewsDetailFragment;
import com.greedygame.newsbreeze.feature.saved.SavedListFragment;
import com.greedygame.newsbreeze.feature.saved.SavedListViewModel;
import com.greedygame.newsbreeze.feature.saved.SavedListViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
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
public final class DaggerAndroidApplication_HiltComponents_SingletonC extends AndroidApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final ApplicationModule applicationModule;

  private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC = this;

  private Provider<MyPreference> myPreferenceProvider;

  private Provider<Service> provideServiceProvider;

  private Provider<AppDatabase> provideYourDatabaseProvider;

  private Provider<NewsRepo> provideNewsRepoProvider;

  private DaggerAndroidApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam,
      ApplicationModule applicationModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.applicationModule = applicationModuleParam;
    initialize(applicationContextModuleParam, applicationModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private MyPreference myPreference() {
    return new MyPreference(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private AppDatabase appDatabase() {
    return ApplicationModule_ProvideYourDatabaseFactory.provideYourDatabase(applicationModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private NewsRepo.Network network() {
    return new NewsRepo.Network(provideServiceProvider.get(), provideYourDatabaseProvider.get());
  }

  private NewsRepo newsRepo() {
    return ApplicationModule_ProvideNewsRepoFactory.provideNewsRepo(applicationModule, network());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam,
      final ApplicationModule applicationModuleParam) {
    this.myPreferenceProvider = DoubleCheck.provider(new SwitchingProvider<MyPreference>(singletonC, 0));
    this.provideServiceProvider = DoubleCheck.provider(new SwitchingProvider<Service>(singletonC, 2));
    this.provideYourDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<AppDatabase>(singletonC, 3));
    this.provideNewsRepoProvider = DoubleCheck.provider(new SwitchingProvider<NewsRepo>(singletonC, 1));
  }

  @Override
  public void injectAndroidApplication(AndroidApplication androidApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private ApplicationModule applicationModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public AndroidApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (applicationModule == null) {
        this.applicationModule = new ApplicationModule();
      }
      return new DaggerAndroidApplication_HiltComponents_SingletonC(applicationContextModule, applicationModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements AndroidApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(
        DaggerAndroidApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public AndroidApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements AndroidApplication_HiltComponents.ActivityC.Builder {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public AndroidApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements AndroidApplication_HiltComponents.FragmentC.Builder {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public AndroidApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements AndroidApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public AndroidApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements AndroidApplication_HiltComponents.ViewC.Builder {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public AndroidApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements AndroidApplication_HiltComponents.ViewModelC.Builder {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public AndroidApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements AndroidApplication_HiltComponents.ServiceC.Builder {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private android.app.Service service;

    private ServiceCBuilder(DaggerAndroidApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(android.app.Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public AndroidApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, android.app.Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends AndroidApplication_HiltComponents.ViewWithFragmentC {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends AndroidApplication_HiltComponents.FragmentC {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectNewsFragment(NewsFragment newsFragment) {
      injectNewsFragment2(newsFragment);
    }

    @Override
    public void injectNewsDetailFragment(NewsDetailFragment newsDetailFragment) {
    }

    @Override
    public void injectSavedListFragment(SavedListFragment savedListFragment) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    private NewsFragment injectNewsFragment2(NewsFragment instance) {
      NewsFragment_MembersInjector.injectPref(instance, singletonC.myPreferenceProvider.get());
      return instance;
    }
  }

  private static final class ViewCImpl extends AndroidApplication_HiltComponents.ViewC {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends AndroidApplication_HiltComponents.ActivityC {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectBaseActivity(BaseActivity baseActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(2).add(NewsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SavedListViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends AndroidApplication_HiltComponents.ViewModelC {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<NewsViewModel> newsViewModelProvider;

    private Provider<SavedListViewModel> savedListViewModelProvider;

    private ViewModelCImpl(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private NewsViewModel newsViewModel() {
      return new NewsViewModel(singletonC.provideNewsRepoProvider.get());
    }

    private SavedListViewModel savedListViewModel() {
      return new SavedListViewModel(singletonC.provideNewsRepoProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.newsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.savedListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(2).put("com.greedygame.newsbreeze.feature.NewsViewModel", (Provider) newsViewModelProvider).put("com.greedygame.newsbreeze.feature.saved.SavedListViewModel", (Provider) savedListViewModelProvider).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.greedygame.newsbreeze.feature.NewsViewModel 
          return (T) viewModelCImpl.newsViewModel();

          case 1: // com.greedygame.newsbreeze.feature.saved.SavedListViewModel 
          return (T) viewModelCImpl.savedListViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends AndroidApplication_HiltComponents.ActivityRetainedC {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerAndroidApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends AndroidApplication_HiltComponents.ServiceC {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerAndroidApplication_HiltComponents_SingletonC singletonC,
        android.app.Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerAndroidApplication_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerAndroidApplication_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.greedygame.newsbreeze.core.di.MyPreference 
        return (T) singletonC.myPreference();

        case 1: // com.greedygame.newsbreeze.feature.NewsRepo 
        return (T) singletonC.newsRepo();

        case 2: // com.greedygame.newsbreeze.core.service.Service 
        return (T) ApplicationModule_ProvideServiceFactory.provideService(singletonC.applicationModule);

        case 3: // com.greedygame.newsbreeze.core.persistance.AppDatabase 
        return (T) singletonC.appDatabase();

        default: throw new AssertionError(id);
      }
    }
  }
}
