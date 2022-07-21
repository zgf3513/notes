package com.test.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 等价于在配置文件中注册一个bean
// @Component 组件
@Component
public class User {
    @Value("张三")
    public String name;
}
