package com.hebo.entity;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by hebo on 2018/4/2.
 * 用户信息
 */
public class User implements Serializable{
    @Max(value = 999999,message = "超过最大数值")
    @Min(value = 10,message = "超过最小数值")
    private long id;

    @NotBlank
    private String clientNo;

    @Valid
    @NotNull(message = "订单不能为空")
    @Size(min = 1, message = "orderList必须1个")
    private List<Order> orderList;

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


    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
