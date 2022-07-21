package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{

    // hello/h1
    @RequestMapping("/hello")
    public String hello(Model model){
        // 封装数据
        model.addAttribute("msg","hello springmvcAnnotation");
        return "hello"; // 会被试图解析处理
    }

}
