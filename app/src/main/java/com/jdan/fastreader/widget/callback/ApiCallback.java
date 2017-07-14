package com.jdan.fastreader.widget.callback;


/**
 *
 * @param <M>
 */
public interface ApiCallback<M> {

    void onSuccess(M model);

    void onFailure(int code, String msg);

    void onCompleted();

}
