package com.shang.adapter;

public class Adapter extends Source implements Targetable {
    @Override
    public void method_2() {
        System.out.println("this is the targetable method!");
    }
}
