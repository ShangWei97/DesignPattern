package com.shang.factory;

/**
 * 抽象工厂模式
 * @author shangwei
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
