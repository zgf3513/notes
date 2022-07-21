package com.test.mapper;

import com.test.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 通过id查询
     * @param id
     * @return
     */
    User getById(int id);

    /**
     * 分页查询的实现
     * @param map
     * @return
     */
    List<User> getUserByLimit(Map<String,Integer> map);
    List<User> getUserRowBounds();

}
