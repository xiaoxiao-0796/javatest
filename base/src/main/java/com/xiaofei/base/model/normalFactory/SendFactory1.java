package com.xiaofei.base.model.normalFactory;

/**
 * 多个工厂方法魔术
 */
public class SendFactory1 {

    Sender produceSms(){
        return new SmsSender();
    }

    Sender produceMail(){
        return new MailSender();
    }
}
