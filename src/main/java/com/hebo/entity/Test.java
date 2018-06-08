package com.hebo.entity;

import java.io.Serializable;

/**
 * Created by hebo on 2018/6/4.
 */
public class Test implements Serializable {

    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
