package com.xiaofei.base.model.abstractFactory;

public class SmsFactory implements Privider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
