package com.hebo.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Created by hebo on 2018/4/9.
 */
public class Order implements Serializable{

    @Max(value = 1000,message = "最大不能超过1000")
    private long orderId;

    @NotBlank
    private String orderName;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
