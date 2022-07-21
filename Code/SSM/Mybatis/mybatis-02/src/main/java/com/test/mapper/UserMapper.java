package com.test.mapper;

import com.test.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> getAll();

    /**
     * 通过id查询
     * @param id
     * @return
     */
    User getById(int id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(int id);
}
