package com.greedygame.newsbreeze.databinding;
import com.greedygame.newsbreeze.R;
import com.greedygame.newsbreeze.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NewsListItemBindingImpl extends NewsListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.separator_view, 2);
        sViewsWithIds.put(R.id.bookmark_btn, 3);
        sViewsWithIds.put(R.id.image, 4);
        sViewsWithIds.put(R.id.title, 5);
        sViewsWithIds.put(R.id.description, 6);
        sViewsWithIds.put(R.id.date, 7);
        sViewsWithIds.put(R.id.read_btn, 8);
        sViewsWithIds.put(R.id.save_btn, 9);
        sViewsWithIds.put(R.id.guideline2, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NewsListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private NewsListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.cardView2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.isFirstItem == variableId) {
            setIsFirstItem((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsFirstItem(@Nullable java.lang.Boolean IsFirstItem) {
        this.mIsFirstItem = IsFirstItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isFirstItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxIsFirstItem = false;
        java.lang.Boolean isFirstItem = mIsFirstItem;
        float isFirstItemCardView2AndroidDimenMargin20CardView2AndroidDimenMargin0 = 0f;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isFirstItem)
                androidxDatabindingViewDataBindingSafeUnboxIsFirstItem = androidx.databinding.ViewDataBinding.safeUnbox(isFirstItem);
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsFirstItem) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isFirstItem) ? @android:dimen/margin_20 : @android:dimen/margin_0
                isFirstItemCardView2AndroidDimenMargin20CardView2AndroidDimenMargin0 = ((androidxDatabindingViewDataBindingSafeUnboxIsFirstItem) ? (cardView2.getResources().getDimension(R.dimen.margin_20)) : (cardView2.getResources().getDimension(R.dimen.margin_0)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.greedygame.newsbreeze.feature.NewsListAdapterKt.setLayoutMarginTop(this.cardView2, isFirstItemCardView2AndroidDimenMargin20CardView2AndroidDimenMargin0);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isFirstItem
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(isFirstItem) ? @android:dimen/margin_20 : @android:dimen/margin_0
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isFirstItem) ? @android:dimen/margin_20 : @android:dimen/margin_0
    flag mapping end*/
    //end
}