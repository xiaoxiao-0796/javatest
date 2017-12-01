package com.xiaofei.base.model.observer;

public class MySubject extends AbSubject{
    @Override
    public void operation() {
        System.out.println("self updated");
        notifyServer();
    }
}
