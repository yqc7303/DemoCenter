package com.yangqichao.commonlib;

import android.app.Application;

/**
 * Created by yangqc on 2017/3/23.
 */

public class APP extends Application{

    private static APP application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static APP getInstance() {
        return application;
    }
}
