package com.xiaofei.base.model.normalFactory;

public class SmsSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is smssender");
    }
}
