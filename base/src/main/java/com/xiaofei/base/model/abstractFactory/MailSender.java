package com.xiaofei.base.model.abstractFactory;

public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is mailsender");
    }
}
