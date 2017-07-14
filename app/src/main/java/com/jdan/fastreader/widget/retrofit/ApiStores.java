package com.jdan.fastreader.widget.retrofit;

import com.jdan.fastreader.domain.bean.LoginBean;
import com.jdan.fastreader.domain.constants.GlobalVariable;
import com.jdan.fastreader.domain.constants.UrlFactory;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Nan&Cxx on 2017/7/13.
 */
public interface ApiStores {

    @GET(UrlFactory.LOGIN_URL)
    Observable<LoginBean> login(@Query(GlobalVariable.USERNAME) String username, @Query(GlobalVariable.PASSWORD) String code);
}
