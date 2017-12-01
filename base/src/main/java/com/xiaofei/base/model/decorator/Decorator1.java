package com.xiaofei.base.model.decorator;

public class Decorator1 implements Source{

    private Source source;

    public Decorator1(Source source){
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("this is decorator method");
        source.method();
    }
}
