package com.test.mapper;

import com.test.entity.User;
import com.test.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.getById(1);
        System.out.println(user1);
        sqlSession.close();

        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.getById(1);
        System.out.println(user2);
//        HashMap map = new HashMap();
//        map.put("pass","555");
//        map.put("id",1);
//        mapper.update(map);
//        sqlSession.clearCache();
//        User user2 = mapper.getById(1);
//        System.out.println(user2);

        sqlSession2.close();
    }




}
