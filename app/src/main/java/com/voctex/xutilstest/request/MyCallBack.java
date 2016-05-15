package com.voctex.xutilstest.request;

import org.xutils.common.Callback;

/**
 * Created by Voctex on 2016/5/15.
 */
public class MyCallBack<T> implements Callback.CommonCallback<T> {
    @Override
    public void onSuccess(T result) {
        //可以根据公司的需求进行统一的请求成功的逻辑处理
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        //可以根据公司的需求进行统一的请求网络失败的逻辑处理
    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }
}
