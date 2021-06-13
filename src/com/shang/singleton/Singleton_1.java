package com.shang.singleton;

/**
 * 单例模式（懒汉式）
 *
 * @author shangwei
 */
public class Singleton_1 {
    private static Singleton_1 singleton_1;

    private Singleton_1() {
    }

    public static Singleton_1 getInstance() {
        if (singleton_1 == null) {
            singleton_1 = new Singleton_1();
        }
        return singleton_1;
    }

}
