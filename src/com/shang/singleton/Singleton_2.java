package com.shang.singleton;

/**
 * 单例模式（懒汉式，双重校验锁）
 *
 * @author shangwei
 * @date 2021/6/9
 */
public class Singleton_2 {

    private static volatile Singleton_2 singleton_2 = null;

    private Singleton_2() {
    }

    public static synchronized Singleton_2 getInstance() {
        if (singleton_2 == null) {
            singleton_2 = new Singleton_2();
        }
        return singleton_2;
    }
}
