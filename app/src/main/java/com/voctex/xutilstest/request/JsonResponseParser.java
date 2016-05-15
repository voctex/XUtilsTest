package com.voctex.xutilstest.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.xutils.http.app.ResponseParser;
import org.xutils.http.request.UriRequest;

import java.lang.reflect.Type;

/**
 * Created by Voctex on 2016/5/15.
 */
public class JsonResponseParser implements ResponseParser{

    @Override
    public void checkResponse(UriRequest request) throws Throwable {

    }

    @Override
    public Object parse(Type resultType, Class<?> resultClass, String result) throws Throwable {
        //返回回来的json数据就是在这里进行解析后再回调的
        return new Gson().fromJson(result,resultType);
    }
}
