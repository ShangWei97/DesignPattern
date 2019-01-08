package com.shang.adapter;

public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source){
        super();
        this.source=source;

    }
    @Override
    public void method_1() {
        source.method_1();
    }

    @Override
    public void method_2() {
        System.out.println("this is the targetable method!");
    }
}
