package com.greedygame.newsbreeze;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.greedygame.newsbreeze.databinding.FooterItemBindingImpl;
import com.greedygame.newsbreeze.databinding.FragmentNewsBindingImpl;
import com.greedygame.newsbreeze.databinding.FragmentNewsDetailBindingImpl;
import com.greedygame.newsbreeze.databinding.FragmentSavedBindingImpl;
import com.greedygame.newsbreeze.databinding.MealItemBindingImpl;
import com.greedygame.newsbreeze.databinding.NewsListItemBindingImpl;
import com.greedygame.newsbreeze.databinding.SavedNewsListItemBindingImpl;
import com.greedygame.newsbreeze.databinding.SeparatorNewsItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FOOTERITEM = 1;

  private static final int LAYOUT_FRAGMENTNEWS = 2;

  private static final int LAYOUT_FRAGMENTNEWSDETAIL = 3;

  private static final int LAYOUT_FRAGMENTSAVED = 4;

  private static final int LAYOUT_MEALITEM = 5;

  private static final int LAYOUT_NEWSLISTITEM = 6;

  private static final int LAYOUT_SAVEDNEWSLISTITEM = 7;

  private static final int LAYOUT_SEPARATORNEWSITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.greedygame.newsbreeze.R.layout.footer_item, LAYOUT_FOOTERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.greedygame.newsbreeze.R.layout.fragment_news, LAYOUT_FRAGMENTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.greedygame.newsbreeze.R.layout.fragment_news_detail, LAYOUT_FRAGMENTNEWSDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.greedygame.newsbreeze.R.layout.fragment_saved, LAYOUT_FRAGMENTSAVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.greedygame.newsbreeze.R.layout.meal_item, LAYOUT_MEALITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.greedygame.newsbreeze.R.layout.news_list_item, LAYOUT_NEWSLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.greedygame.newsbreeze.R.layout.saved_news_list_item, LAYOUT_SAVEDNEWSLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.greedygame.newsbreeze.R.layout.separator_news_item, LAYOUT_SEPARATORNEWSITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FOOTERITEM: {
          if ("layout/footer_item_0".equals(tag)) {
            return new FooterItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for footer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWS: {
          if ("layout/fragment_news_0".equals(tag)) {
            return new FragmentNewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_news is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWSDETAIL: {
          if ("layout/fragment_news_detail_0".equals(tag)) {
            return new FragmentNewsDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_news_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSAVED: {
          if ("layout/fragment_saved_0".equals(tag)) {
            return new FragmentSavedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_saved is invalid. Received: " + tag);
        }
        case  LAYOUT_MEALITEM: {
          if ("layout/meal_item_0".equals(tag)) {
            return new MealItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for meal_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NEWSLISTITEM: {
          if ("layout/news_list_item_0".equals(tag)) {
            return new NewsListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for news_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SAVEDNEWSLISTITEM: {
          if ("layout/saved_news_list_item_0".equals(tag)) {
            return new SavedNewsListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for saved_news_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SEPARATORNEWSITEM: {
          if ("layout/separator_news_item_0".equals(tag)) {
            return new SeparatorNewsItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for separator_news_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "isFirstItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/footer_item_0", com.greedygame.newsbreeze.R.layout.footer_item);
      sKeys.put("layout/fragment_news_0", com.greedygame.newsbreeze.R.layout.fragment_news);
      sKeys.put("layout/fragment_news_detail_0", com.greedygame.newsbreeze.R.layout.fragment_news_detail);
      sKeys.put("layout/fragment_saved_0", com.greedygame.newsbreeze.R.layout.fragment_saved);
      sKeys.put("layout/meal_item_0", com.greedygame.newsbreeze.R.layout.meal_item);
      sKeys.put("layout/news_list_item_0", com.greedygame.newsbreeze.R.layout.news_list_item);
      sKeys.put("layout/saved_news_list_item_0", com.greedygame.newsbreeze.R.layout.saved_news_list_item);
      sKeys.put("layout/separator_news_item_0", com.greedygame.newsbreeze.R.layout.separator_news_item);
    }
  }
}
