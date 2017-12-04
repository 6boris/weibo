package com.weibo.extend;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.ParseException;

import java.util.Objects;

public class MS_Result {
//    状态数值，0表示成功，非零表示失败
    private Integer status;

//    提示信息
    private String messages;

//    返回的数据
    private String data;

    public void setAll(Integer status, String messages , String data){
        this.status = status;
        this.messages = messages;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}