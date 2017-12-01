package com.xiaofei.base.model.decorator;

public class Decorator2 implements Source{

    private Source source;

    public Decorator2(Source source){
        this.source =source;
    }

    @Override
    public void method() {
        source.method();
        System.out.println("this is Decorator 2 method");
    }
}
