package com.zpc.diy;

// 使用注解实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect  // 标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.zpc.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("------------before-----------------");
    }

    @After("execution(* com.zpc.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("-------------after------------------");
    }

    // 在环绕增强中，我们可以给一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.zpc.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        System.out.println(jp.getSignature());  // 获得签名
        // 执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");
    }

}
