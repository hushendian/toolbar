package com.xl.test;

/**
 * Created by hushendian on 2017/7/19.
 */

public abstract class LazyFragment extends BaseSupportFragment {


    protected boolean isVisible;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()) {
            isVisible = true;
            onVisible();
        } else {
            isVisible = false;
            onInvisible();
        }
    }

    protected abstract void onInvisible();

    protected void onVisible() {
        lazyLoad();
    }

    protected abstract void lazyLoad();
}
