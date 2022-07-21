package com.test.mapper;

import com.test.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    /**
     * 查询所有老师
     * @return
     */
    List<Teacher> getAll();
}
