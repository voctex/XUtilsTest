package com.voctex.xutilstest.bean;

import com.voctex.xutilstest.request.JsonResponseParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * Created by Voctex on 2016/5/15.
 */
@HttpResponse(parser = JsonResponseParser.class)
public class BaseBean<T,E> {
    private List<T> queryLocation;

    private List<E> addrList;

    public List<T> getQueryLocation() {
        return queryLocation;
    }

    public void setQueryLocation(List<T> queryLocation) {
        this.queryLocation = queryLocation;
    }

    public List<E> getAddrList() {
        return addrList;
    }

    public void setAddrList(List<E> addrList) {
        this.addrList = addrList;
    }
}
