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

}
