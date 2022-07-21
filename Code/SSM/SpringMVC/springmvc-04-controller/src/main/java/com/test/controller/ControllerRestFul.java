package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerRestFul {

    // method：限定请求方法
    /*@DeleteMapping("add/{a}/{b})"*/
    /*@GetMapping("add/{a}/{b})"*/
    /*@PostMapping("add/{a}/{b})"*/
    @RequestMapping(value = "add/{a}/{b}",method = RequestMethod.DELETE)
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        model.addAttribute("mag",a+b);
        return "test";
    }
}
