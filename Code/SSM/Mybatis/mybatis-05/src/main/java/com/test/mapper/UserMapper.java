package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 通过id查询
     * @return
     */
    @Select("select * from MybatisTest.user")
    List<User> getAll();

}
