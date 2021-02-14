package com.todaylunch.testproject;

public class ProxyRealConcrete implements ProxyInterface {

    @Override
    public String doSomething(String p) {
        return (p + " return!");
    }
}
