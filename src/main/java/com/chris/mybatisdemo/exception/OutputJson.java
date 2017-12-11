package com.chris.mybatisdemo.exception;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by Chris on 2017/12/11.
 */

public class OutputJson implements Serializable {

    /**
     * 返回客户端统一格式，包括状态码，提示信息，以及业务数据
     */
    private static final long serialVersionUID = 1L;
    //状态码
    private int status;
    //必要的提示信息
    private String message;
    //业务数据
    private Object dataMap;

    public OutputJson(int status,String message,Object dataMap){
        this.status = status;
        this.message = message;
        this.dataMap = dataMap;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getDataMap() {
        return dataMap;
    }
    public void setDataMap(Object dataMap) {
        this.dataMap = dataMap;
    }
    public String toString(){
        if(null == this.dataMap){
            this.setDataMap(new Object());
        }
        return JSON.toJSONString(this);
    }
}