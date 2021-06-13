package com.shang.singleton;

/**
 * 懒汉模式（双重校验锁）
 *
 * @author shangwei
 * @date 2021/6/9
 */
public class Singleton_3 {

    private static volatile Singleton_3 singleton_3 = null;

    private Singleton_3() {
    }

    /**
     * 双重校验
     * <p>
     * 考虑下面的实现，也就是只使用了一个 if 语句。
     * 在 singleton_3 == null 的情况下，如果两个线程都执行了 if 语句，
     * 那么两个线程都会进入 if 语句块内。虽然在 if 语句块内有加锁操作，
     * 但是两个线程都会执行 singleton_3 = new Singleton_3();
     * 这条语句，只是先后的问题，那么就会进行两次实例化。
     * 因此必须使用双重校验锁，也就是需要使用两个 if 语句：
     * 第一个 if 语句用来避免 singleton_3 已经被实例化之后的加锁操作，
     * 而第二个 if 语句进行了加锁，所以只能有一个线程进入，
     * 就不会出现 singleton_3 == null 时两个线程同时进行实例化操作。
     * <p>
     * singleton_3 采用 volatile 关键字修饰也是很有必要的，
     * singleton_3 = new Singleton_3(); 这段代码其实是分为三步执行：
     * 1.为 singleton_3 分配内存空间
     * 2.初始化 singleton_3
     * 3.将 singleton_3 指向分配的内存地址
     * 但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1>3>2。
     * 指令重排在单线程环境下不会出现问题，但是在多线程环境下会导致一个线程获得还没有初始化的实例。
     * 例如，线程 T1 执行了 1 和 3，此时 T2 调用 getInstance() 后发现 singleton_3 不为空，
     * 因此返回 singleton_3，但此时 singleton_3 还未被初始化。
     * <p>
     * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
     *
     * @return
     */
    public static Singleton_3 getInstance() {
        if (singleton_3 == null) {
            synchronized (Singleton_3.class) {
                if (singleton_3 == null) {
                    singleton_3 = new Singleton_3();
                }
            }
        }
        return singleton_3;
    }

}
