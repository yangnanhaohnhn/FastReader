package com.jdan.fastreader.presenter;

import com.jdan.fastreader.ui.view.BaseView;

/**
 * 公共的Presenter
 * Created by Nan&Cxx on 2017/7/13.
 */
public interface IBasePresenter {
    void attachView(BaseView view);

    void detachView();
}
