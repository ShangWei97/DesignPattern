package com.shang.factory;

/**
 * 抽象工厂模式
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
