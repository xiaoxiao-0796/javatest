package com.xiaofei.base.model.proxy;

public class Proxy implements Sourceable{

    private Source source;

    public Proxy(){
        super();
        source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("this is proxy after");
    }

    private void before() {
        System.out.println("this is proxy before");
    }
}

