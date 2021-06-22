package com.shang.decorator;

/**
 * 装饰者模式测试
 *
 * @author shangwei
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
