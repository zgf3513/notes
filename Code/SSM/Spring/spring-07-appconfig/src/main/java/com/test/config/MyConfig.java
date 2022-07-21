package com.test.config;

import com.test.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// 这个也会被Spring容器托管注册到容器中，因为它本身就是个Component，就和我们之前的beans.xml一样的
@ComponentScan("com.test.entity")
@Import(MyConfig2.class)
public class MyConfig {

    // 注册一个bean就相当于之前写的一个bean标签
    // id为这个方法的名字，class属性就是方法的返回值
    // return就是要注入的对象
    @Bean
    public User getUser(){
        return new User();
    }
}
