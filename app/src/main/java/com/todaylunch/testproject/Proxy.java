package com.todaylunch.testproject;

public class Proxy implements ProxyInterface {

    ProxyInterface proxyInterface;

    @Override
    public String doSomething(String p) {

        System.out.println("------------------------");

        //ex. 배그 대기화면


        proxyInterface = new ProxyRealConcrete();
        System.out.println(proxyInterface.doSomething("HEY!!"));
        //ex. 실제 맵 로딩

        System.out.println("=======================");


        return p;
    }
}
