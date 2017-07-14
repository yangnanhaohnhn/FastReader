package com.jdan.fastreader.util;

import android.app.AlertDialog;
import android.content.Context;

import com.jdan.fastreader.presenter.IBasePresenter;
import com.jdan.fastreader.ui.activity.BaseActivity;
import com.jdan.fastreader.widget.loading.SpotsDialog;

/**
 * Created by Nan&Cxx on 2017/7/14.
 */
public class ShowDialogUtils {
    /**
     * loading对话框
     *
     * @param context
     */
    public static AlertDialog createLoading(Context context) {
        AlertDialog dialog =  new SpotsDialog(context);
        return dialog;
    }
}
