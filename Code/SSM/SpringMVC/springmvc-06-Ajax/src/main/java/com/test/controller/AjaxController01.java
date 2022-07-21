package com.test.controller;

import com.test.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController01 {
    @RequestMapping("/01")
    public String test01(Model model){
        return "ajax";
    }
    @RequestMapping("/02")
    public void test02(@WebParam String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        response.getWriter().println(name);
    }

    @RequestMapping("/03")
    public List<User> test03(){
        List<User> list = new ArrayList<>();
        list.add(new User("张三1",18,"男"));
        list.add(new User("张三2",18,"男"));
        list.add(new User("张三3",18,"男"));
        list.add(new User("张三4",18,"男"));
        return list;
    }
}
