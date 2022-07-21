package com.test.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 使用注解实现
@Aspect// 标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.test.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===================执行前");
    }
    @After("execution(* com.test.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===================执行后");
    }
    // 在环绕增强中，我们可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.test.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("===================执行环绕前");
        Object proceed = jp.proceed();// 执行方法
        System.out.println("===================执行环绕后");
    }
}
