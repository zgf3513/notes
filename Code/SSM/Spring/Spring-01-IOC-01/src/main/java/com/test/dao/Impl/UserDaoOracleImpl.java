package com.test.dao.Impl;

import com.test.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Oracle的实现");
    }
}
