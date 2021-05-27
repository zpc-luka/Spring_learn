package com.zpc.demo04;

import com.zpc.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //得到代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //处理代理示例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强代码
        log(method);
        //动态代理本质，使用反射
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(Method method) {
        System.out.println("执行了" + method.getName() + "方法");
    }
}