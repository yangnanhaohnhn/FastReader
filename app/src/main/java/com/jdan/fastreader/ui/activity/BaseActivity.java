package com.jdan.fastreader.ui.activity;

import android.app.AlertDialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.jdan.fastreader.presenter.IBasePresenter;
import com.jdan.fastreader.util.ShowDialogUtils;

import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;


/**
 * Created by Nan&Cxx on 2017/7/13.
 */
public abstract class BaseActivity<P extends IBasePresenter> extends AppCompatActivity implements View.OnClickListener{
    protected P mvpPresenter;
    private AlertDialog dialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mvpPresenter = createPresenter();
        setContentView(getViewId());
        ButterKnife.bind(this);
        initData(savedInstanceState);
    }

    /**
     * loading...
     */
    public void loading(){
        dialog = ShowDialogUtils.createLoading(this);
        dialog.show();
    }

    /**
     * 关闭loading...
     */
    public void dismissLoading(){
        if (dialog != null){
            dialog.dismiss();
        }
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public Resources getResources() {
        Resources res = super.getResources();
        Configuration config = new Configuration();
        config.setToDefaults();
        res.updateConfiguration(config, res.getDisplayMetrics());
        return res;
    }

    protected abstract P createPresenter();

    protected abstract int getViewId();

    protected abstract void initData(Bundle savedInstanceState);

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
        super.onDestroy();
    }
}
