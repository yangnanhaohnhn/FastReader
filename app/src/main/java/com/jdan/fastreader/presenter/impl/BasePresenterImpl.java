package com.jdan.fastreader.presenter.impl;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jdan.fastreader.presenter.IBasePresenter;
import com.jdan.fastreader.ui.view.BaseView;
import com.jdan.fastreader.widget.callback.ApiCallback;
import com.jdan.fastreader.widget.callback.SubscriberCallBack;
import com.jdan.fastreader.widget.retrofit.ApiStores;
import com.jdan.fastreader.widget.retrofit.AppClient;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * 公共的BasePresenterImpl
 * Created by Nan&Cxx on 2017/7/13.
 */
public class BasePresenterImpl<V extends BaseView> implements IBasePresenter {
    public V mvpView;
    private CompositeSubscription mCompositeSubscription;
    public ApiStores apiStores = AppClient.retrofit().create(ApiStores.class);

    @Override
    public void attachView(BaseView view) {
        mvpView = (V) view;
    }

    public void setText(View view, int title) {
        if (view instanceof TextView){
            ((TextView)view).setText(mvpView.getActivityContext().getString(title));
        }else if(view instanceof Button){
            ((Button)view).setText(mvpView.getActivityContext().getString(title));
        }
    }
    public void setText(View view, String title) {
        if (view instanceof TextView){
            ((TextView)view).setText(title);
        }else if(view instanceof Button){
            ((Button)view).setText(title);
        }
    }

    @Override
    public void detachView() {
        this.mvpView = null;
        onUnsubscribe();
    }

    /**
     * RxJava取消注册,以避免内存泄漏
     */
    private void onUnsubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    /**
     * 添加subscri
     *
     * @param observable
     * @param apiCallback
     */
    public void addSubscription(Observable observable, ApiCallback apiCallback) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SubscriberCallBack(apiCallback)));
    }
}
