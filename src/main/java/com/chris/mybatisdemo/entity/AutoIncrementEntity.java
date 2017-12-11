package com.chris.mybatisdemo.entity;

import java.io.Serializable;

/**
 * Created by Chris on 2017/12/4.
 */

public class AutoIncrementEntity implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
