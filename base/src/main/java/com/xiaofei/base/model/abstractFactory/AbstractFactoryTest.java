package com.xiaofei.base.model.abstractFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        Privider privider = new MailFactory();
        Sender sender = privider.produce();
        sender.send();
    }
}
