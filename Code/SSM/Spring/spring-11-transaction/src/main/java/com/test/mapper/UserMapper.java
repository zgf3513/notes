package com.test.mapper;

import com.test.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 获取所有用户
     * @return
     */
    List<User> getAll();

    /**
     * 增加用户
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 删除用户
     * @param uid
     * @return
     */
    int delete(long uid);
}
