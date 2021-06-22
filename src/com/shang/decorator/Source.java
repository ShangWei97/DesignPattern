package com.shang.decorator;

/**
 * 源对象
 *
 * @author shangwei
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is a original method");
    }
}
