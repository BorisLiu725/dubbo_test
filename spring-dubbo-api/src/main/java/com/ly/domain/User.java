package com.ly.domain;


import java.io.Serializable;

/**
 * Created by BorisLiu on 2019/12/13
 */

public class User implements Serializable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
