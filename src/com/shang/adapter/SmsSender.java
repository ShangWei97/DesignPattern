package com.shang.adapter;

public class SmsSender extends Sender {
    @Override
    public void sendSms() {
        System.out.println("this is a sms sender");
    }
}
