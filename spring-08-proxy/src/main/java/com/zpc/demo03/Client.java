package com.zpc.demo03;

public class Client {

    public static void main(String[] args) {
        Host host = new Host();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理我们调用的接口对象
        pih.setRent(host);      // 这里Host实现了Rent 多态
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();

    }
}
