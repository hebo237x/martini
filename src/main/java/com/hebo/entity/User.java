package com.hebo.entity;

import java.io.Serializable;

/**
 * Created by hebo on 2018/4/2.
 * 用户信息
 */
public class User implements Serializable{
 /*   @Max(value = 999999,message = "超过最大数值")
    @Min(value = 10,message = "超过最小数值")*/
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
