package com.zgf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    // 返回一些Car信息
    @RequestMapping("/gets")
    public String getCarInfo(){
        return "[{\"id\":1,\"name\":\"奔驰\",\"age\":18},{\"id\":2,\"name\":\"宝马\",\"age\":19}]";
    }
}
