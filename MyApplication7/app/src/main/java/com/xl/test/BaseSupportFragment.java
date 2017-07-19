package com.xl.test;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by hushendian on 2017/7/19.
 */

public class BaseSupportFragment extends Fragment {

    @Nullable
    @BindView(R.id.toolbar)
    public Toolbar toolbarView;

    @Nullable
    @BindView(R.id.toolbar_title)
    public TextView toolbarTitleView;
    Unbinder unbinder;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this, view);
        if (toolbarTitleView != null && !TextUtils.isEmpty(getTitle())) {
            toolbarTitleView.setText(getTitle());
        }
    }

    protected String getTitle() {
        return "";

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
