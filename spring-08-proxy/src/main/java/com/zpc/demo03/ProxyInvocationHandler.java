package com.zpc.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //得到代理对象
    public Object getProxy(){
         return Proxy.newProxyInstance(rent.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    //处理代理示例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHosue();
        //动态代理本质，使用反射
        Object result = method.invoke(rent, args);
        Fare();
        return result;
    }

    public void seeHosue(){
        System.out.println("中介带看房子");
    }

    public void Fare() {
        System.out.println("收中介费");
    }
}
