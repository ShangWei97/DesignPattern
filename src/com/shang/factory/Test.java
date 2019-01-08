package com.shang.factory;

/**
 * 测试抽象工厂
 */
public class Test {
    public static void main(String[] args){
        Provider provider=new SendSmsFactory();
        Sender sender=provider.produce();
        sender.send();
    }
}
