package com.shang.factory;

/**
 *静态工厂模式：将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class SendFactory_2 {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args){
        Sender sender= SendFactory_2.produceMail();
        sender.send();
    }

}
