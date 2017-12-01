package com.xiaofei.base.model.normalFactory;

/**
 * 发邮件实现
 */
public class MailSender  implements Sender {
    @Override
    public void sender() {
        System.out.println("this is mailsender");
    }
}
