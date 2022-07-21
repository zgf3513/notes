package com.test.dao.Impl;

import com.test.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("获取User");
    }
}
