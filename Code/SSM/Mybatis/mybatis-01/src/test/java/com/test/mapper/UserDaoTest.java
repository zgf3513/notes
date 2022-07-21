package com.test.mapper;

import com.test.entity.User;
import com.test.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
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

    @Test
    public void getById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.getUserLike("张");

        System.out.println(users);

        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void add(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User("小七","123");
        int add = userMapper.add(user);
        System.out.println(add);
        if (add>0) {
            sqlSession.commit();
        }
        sqlSession.close();
    }

    public void add2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> map = new HashMap<>();

        map.put("uid",4);
        map.put("uname","小七");
        map.put("password","123");

        int i = userMapper.add2(map);

        System.out.println(i);

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void update(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(6,"小七","1234");
        int result = userMapper.update(user);
        System.out.println(result);
        if (result>0) {
            sqlSession.commit();
        }
        sqlSession.close();
    }

    @Test
    public void delete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.delete(6);
        System.out.println(result);
        if (result>0) {
            sqlSession.commit();
        }
        sqlSession.close();
    }
}
