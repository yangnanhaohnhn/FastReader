package com.jdan.fastreader.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jdan.fastreader.R;
import com.jdan.fastreader.presenter.IMainPresenter;
import com.jdan.fastreader.presenter.impl.IMainPresenterImpl;
import com.jdan.fastreader.ui.view.IMainView;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<IMainPresenter> implements IMainView {


    @OnClick(R.id.main_btn)
    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.main_btn:
                mvpPresenter.onClickBtn();
                break;
        }
    }

    @Override
    protected IMainPresenter createPresenter() {
        return new IMainPresenterImpl(this);
    }

    @Override
    protected int getViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        mvpPresenter.getData();
    }


    @Override
    public Activity getActivityContext() {
        return this;
    }

    @Override
    public void showLoading() {
        loading();
    }

    @Override
    public void hideLoading() {
        dismissLoading();
    }
}
