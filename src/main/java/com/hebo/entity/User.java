package com.hebo.entity;

/**
 * Created by hebo on 2018/4/2.
 * 用户信息
 */
public class User {

    private long id;

    private String clientNo;

    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String password;
    /**
     * 领取token数目
     */
    private int claimedToken;
    /**
     *
     */
    private int isMember;



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
