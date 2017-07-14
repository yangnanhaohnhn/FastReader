package com.jdan.fastreader.domain.bean;

import java.io.Serializable;

/**
 * 默认的bean
 * Created by Nan&Cxx on 2017/7/13.
 */
public class DefaultBean implements Serializable {
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
