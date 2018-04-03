package com.hebo.entity;

/**
 * Created by hebo on 2018/4/2.
 * 用户信息
 */
public class User {

    private long id;

    private String clientNo;

    private String email;

    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }
}
