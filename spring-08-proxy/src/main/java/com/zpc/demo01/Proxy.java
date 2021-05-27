package com.zpc.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        Contract();
        Fare();

    }

    public void seeHouse() {
        System.out.println("看房子");
    }

    public void Contract() {
        System.out.println("签合同");
    }

    public void Fare() {
        System.out.println("收钱");
    }
}
