package com.xiaofei.base.model.decorator;

public class Sourceable implements Source{

    @Override
    public void method() {
        System.out.println("this is original method");
    }
}
