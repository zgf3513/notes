package com.test.entity;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("user的无参");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name"+name);
    }
}
