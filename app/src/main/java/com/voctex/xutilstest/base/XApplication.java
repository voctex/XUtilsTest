package com.voctex.xutilstest.base;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Voctex on 2016/5/15.
 */
public class XApplication  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
    }
}
