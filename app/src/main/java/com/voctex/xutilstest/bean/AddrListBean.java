package com.voctex.xutilstest.bean;

import com.voctex.xutilstest.request.JsonResponseParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * Created by Voctex on 2016/5/15.
 */
@HttpResponse(parser = JsonResponseParser.class)
public class AddrListBean {

    private String type;
    private int status;
    private String name;
    private String admCode;
    private String admName;
    private List<String> nearestPoint;
    private int distance;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmCode() {
        return admCode;
    }

    public void setAdmCode(String admCode) {
        this.admCode = admCode;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }

    public List<String> getNearestPoint() {
        return nearestPoint;
    }

    public void setNearestPoint(List<String> nearestPoint) {
        this.nearestPoint = nearestPoint;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
