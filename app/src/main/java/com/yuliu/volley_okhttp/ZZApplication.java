package com.yuliu.volley_okhttp;

import android.app.Application;


/**
 * 自定义Application
 */
public class ZZApplication extends Application {

    public static ZZApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        MyVolley.init(this);
        mInstance = this;
    }


    public static ZZApplication getInstance() {
        return mInstance;
    }




}
