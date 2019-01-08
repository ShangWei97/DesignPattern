package com.shang.factory;

/**
 * 多个工厂方法模式：该模式是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而
 * 多个工厂方法模式是提供多个工厂方法，分别创建对象
 */

public class SendFactory_1 {

    private Sender produceMail(){
        return new MailSender();
    }

    private Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args){
        SendFactory_1 sendFactory_1=new SendFactory_1();
        Sender sender=sendFactory_1.produceMail();
        sender.send();
    }
}
