package com.jdan.fastreader.domain.bean;

/**
 * Created by Nan&Cxx on 2017/7/13.
 */
public class LoginBean extends DefaultBean {

    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "userInfo=" + userInfo +
                '}';
    }
}
