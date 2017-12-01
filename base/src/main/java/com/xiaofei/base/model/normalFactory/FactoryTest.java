package com.xiaofei.base.model.normalFactory;

import org.junit.Test;

/**
 * 工厂模式测试类
 */
public class FactoryTest {

    /**
     * 普通工厂模式
     * @param args
     */
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("sms");
        sender.sender();
    }

    /**
     * 多个工厂方法工厂模式
     */
    @Test
    public void testSenderFactory1(){
        SendFactory1 sendFactory = new SendFactory1();
        Sender sender = sendFactory.produceMail();
        sender.sender();
    }

    /**
     * 静态方法工厂模式
     */
    @Test
    public void testSenderFactory2(){
        Sender sender = SenderFactory2.mailproduce();
        sender.sender();
    }

}
