package com.test.entity;

public class User {
    private long uid;
    private String pass;
    private int type;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", pass='" + pass + '\'' +
                ", type=" + type +
                '}';
    }

    public User() {
    }

    public User(long uid, String pass, int type) {
        this.uid = uid;
        this.pass = pass;
        this.type = type;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
