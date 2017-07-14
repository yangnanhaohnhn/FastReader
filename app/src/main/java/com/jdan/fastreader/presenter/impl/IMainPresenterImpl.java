package com.jdan.fastreader.presenter.impl;

import com.jdan.fastreader.domain.bean.LoginBean;
import com.jdan.fastreader.domain.constants.GlobalVariable;
import com.jdan.fastreader.presenter.IMainPresenter;
import com.jdan.fastreader.ui.activity.MainActivity;
import com.jdan.fastreader.ui.view.IMainView;
import com.jdan.fastreader.util.LogUtils;
import com.jdan.fastreader.util.MathUtils;
import com.jdan.fastreader.util.Md5Utill;
import com.jdan.fastreader.widget.callback.ApiCallback;
import com.jdan.fastreader.widget.retrofit.ApiStores;

/**
 * 请求网络的在这里
 * Created by Nan&Cxx on 2017/7/13.
 */
public class IMainPresenterImpl extends BasePresenterImpl<IMainView> implements IMainPresenter {

    public IMainPresenterImpl(IMainView view) {
        attachView(view);
    }

    @Override
    public void getData() {
        //获取数据
        LogUtils.e("getData()");
    }

    @Override
    public void onClickBtn() {
        mvpView.showLoading();
        addSubscription(apiStores.login("", Md5Utill.MD5("")), new ApiCallback<LoginBean>() {
            @Override
            public void onSuccess(LoginBean model) {
                if (model.getStatus() == GlobalVariable.ZERO) {
                    LogUtils.e("获取数据" + model.toString());
                } else if (model.getStatus() == GlobalVariable.TWO) {
                    LogUtils.e("没有数据");
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                LogUtils.e("失败 " + code + " | " + msg);
            }

            @Override
            public void onCompleted() {
                mvpView.hideLoading();
            }
        });
    }
}
