package com.ekhaziev.alfasoft.task.entity;

public class Request {

    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Request(String token) {
        this.token = token;
    }
}
