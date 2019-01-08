package com.shang.adapter;

public class AdapterTest {

    public static void main(String[] args){
        //类模式适配器测试
        Targetable target=new Adapter();
        target.method_1();
        target.method_2();

        //对象模式适配器测试
        Source source=new Source();
        Targetable targetable=new Wrapper(source);
        targetable.method_1();
        targetable.method_2();

        //接口模式适配器测试
        Post post=new SmsSender();
        post.sendSms();
    }
}
