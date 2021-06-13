package com.shang.singleton;

/**
 * 静态内部类实现
 *
 * @author shangwei
 * @date 2021/6/9
 */
public class Singleton_5 {

    private Singleton_5() {
    }

    private static class SingletonHolder {
        private static final Singleton_5 singleton_5 = new Singleton_5();
    }

    public static Singleton_5 getInstance() {
        return SingletonHolder.singleton_5;
    }
}
