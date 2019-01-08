package com.shang.decorator;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is a original method");
    }
}
