package com.weibo.extend;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.ParseException;

import java.util.Objects;

public class MS_Result {
    private Integer status;

    private String messages;

    private String data;

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