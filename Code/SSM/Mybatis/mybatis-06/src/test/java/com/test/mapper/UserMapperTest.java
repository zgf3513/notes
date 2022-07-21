package com.test.mapper;

import com.test.entity.Student;
import com.test.entity.Teacher;
import com.test.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getAllStuAndTeacher2();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }


}
