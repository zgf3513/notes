package com.test.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 只要实现类Controller接口的类就说明是一个控制器了
public class ControllerDemo01 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView view = new ModelAndView();
        view.addObject("msg","test1");
        view.setViewName("test");
        return view;
    }
}
