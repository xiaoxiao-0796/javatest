package com.xiaofei.base.model.normalFactory;

/**
 * 静态方法工厂模式
 */
public class SenderFactory2 {

    public static Sender smsproduce(){
        return new SmsSender();
    }

    public static Sender mailproduce(){
        return new MailSender();
    }

}
