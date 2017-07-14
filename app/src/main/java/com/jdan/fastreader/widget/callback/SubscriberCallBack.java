package com.jdan.fastreader.widget.callback;

import com.jdan.fastreader.domain.bean.DefaultBean;
import com.jdan.fastreader.domain.constants.GlobalVariable;
import com.jdan.fastreader.util.JsonUtils;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * 回调
 * @param <M>
 */
public class SubscriberCallBack<M> extends Subscriber<M> {
    private ApiCallback<M> apiCallback;

    public SubscriberCallBack(ApiCallback<M> apiCallback) {
        this.apiCallback = apiCallback;
    }

    @Override
    public void onCompleted() {
        apiCallback.onCompleted();
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            //httpException.response().errorBody().string()
            int code = httpException.code();
            String msg = httpException.getMessage();
            if (code == 504) {
                msg = "网络不给力";
            }
            apiCallback.onFailure(code, msg);
        } else {
            apiCallback.onFailure(0, e.getMessage());
        }
        apiCallback.onCompleted();
    }

    @Override
    public void onNext(M m) {
        apiCallback.onSuccess(m);
    }
}