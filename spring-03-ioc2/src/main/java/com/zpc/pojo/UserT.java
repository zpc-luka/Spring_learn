package com.zpc.pojo;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
