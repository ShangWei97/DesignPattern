package com.shang.builder;

import com.shang.factory.MailSender;
import com.shang.factory.Sender;
import com.shang.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    private List<Sender> list=new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }

    }
    public void produceSmsSender(int a){
        for (int i=0;i<a;i++){
            list.add(new SmsSender());
        }
    }
}
