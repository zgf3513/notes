package com.test.mapper;

import com.test.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 获取所有用户
     * @return
     */
    List<User> getAll();
}
