package com.test.mapper;

import com.test.entity.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int add(Blog blog);
    List<Blog> getAll();
    List<Blog> getIF(Map map);
    List<Blog> getChoose(Map map);
    List<Blog> getForEach(Map map);
    int update(Map map);

}
