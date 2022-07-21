package com.test.mapper;

import com.test.entity.Blog;
import com.test.utils.IDUtils;
import com.test.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog;
        for (int i = 0; i < 10; i++) {
            blog = new Blog(IDUtils.getId(),"title"+i,"张三",new Date(),999);
            mapper.add(blog);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> map = new HashMap<>();

        List list = new ArrayList();
        list.add("60f6ea0ccd1e4a95be6d24ced169c9f7");
        list.add("2c1eefd362b0456e89e3c7ec7ba8f181");
        list.add("dad27e8b88454df4ad094ac506abfc2c");

        map.put("ids",list);

        List<Blog> blogs = mapper.getForEach(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }


}
