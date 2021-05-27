package com.zpc.demo04;

import com.zpc.demo02.UserService;
import com.zpc.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置代理对象
        pih.setTarget(userService);

        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}
