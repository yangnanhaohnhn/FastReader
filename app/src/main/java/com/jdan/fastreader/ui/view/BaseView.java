package com.jdan.fastreader.ui.view;

import android.app.Activity;

/**
 * 公共的view
 * Created by Nan&Cxx on 2017/7/13.
 */
public interface BaseView {
    Activity getActivityContext();

    void showLoading();

    void hideLoading();
}
