package com.test.mapper.Impl;

import com.test.entity.User;
import com.test.mapper.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getAll() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getAll();
    }
}
