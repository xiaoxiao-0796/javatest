package com.xiaofei.base.model.abstractFactory;

public class MailFactory implements Privider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
