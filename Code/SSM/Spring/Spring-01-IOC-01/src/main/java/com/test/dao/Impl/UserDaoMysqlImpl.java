package com.test.dao.Impl;

import com.test.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("MySQL获取用户数据");
    }
}
