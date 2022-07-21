package com.test.mapper;

import com.test.entity.User;
import com.test.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        // 获取SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行Sql

        // 方式1
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.getAll();

        // 方式2(不推荐)
        // List<User> users = sqlSession.selectList("com.test.dao.UserMapper.getAll");

        for (User user : users) {
            System.out.println(user);
        }

        // 关闭sqlSession
        sqlSession.close();
    }
}
