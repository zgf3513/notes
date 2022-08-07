package com.zgf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    // 返回一些学生信息
    @RequestMapping("/gets")
    public String getStudentInfo() {
        return "[{\"id\":1,\"name\":\"张三\",\"age\":18},{\"id\":2,\"name\":\"李四\",\"age\":19}]";
    }
}
