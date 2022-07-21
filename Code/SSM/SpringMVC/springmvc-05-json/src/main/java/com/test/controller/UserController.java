package com.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.test.entity.User;
import com.test.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {

    @RequestMapping("/j1")
    /*@ResponseBody // 不会走视图解析器，会直接返回一个字符串*/
    public String json01() throws JsonProcessingException {
        User user = new User("张三", 18, "男");
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(user);
    }

    @RequestMapping("/j2")
    /*@ResponseBody // 不会走视图解析器，会直接返回一个字符串*/
    public String json02() throws JsonProcessingException {
        User user1 = new User("张三1", 18, "男");
        User user2 = new User("张三2", 18, "男");
        User user3 = new User("张三3", 18, "男");
        User user4 = new User("张三4", 18, "男");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JsonUtils.getJson(list);
    }

    @RequestMapping("/j3")
    /*@ResponseBody // 不会走视图解析器，会直接返回一个字符串*/
    public String json03() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH-mm-ss");
    }

}
