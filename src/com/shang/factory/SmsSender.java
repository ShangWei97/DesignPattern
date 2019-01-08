package com.shang.factory;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is a sms sender");
    }
}
