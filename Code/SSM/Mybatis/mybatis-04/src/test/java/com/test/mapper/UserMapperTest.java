package com.test.mapper;

import com.test.entity.User;
import com.test.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getById(2);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Integer> map = new HashMap<>();

        map.put("startIndex",0);
        map.put("pageSize",2);

        List<User> users = userMapper.getUserByLimit(map);
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void getUserRowBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // RowBounds实现
        RowBounds rowBounds = new RowBounds(1,2);

        // 通过Java代码实现分页
        List<User> users = sqlSession.selectList("com.test.mapper.UserMapper.getUserRowBounds",null,rowBounds);

        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void log4jTest() {
        logger.info("info:进入了log4jTest");
        logger.debug("debug:进入了log4jTest");
        logger.error("error:进入了log4jTest");
    }

}
