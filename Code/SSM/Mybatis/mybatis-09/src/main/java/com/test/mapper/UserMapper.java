package com.test.mapper;

import com.test.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getAll();
    User getById(int id);
    int update(Map map);
}
