package com.shang.singleton;

//单例模式（饿汉式）
public class Singleton {

    private static Singleton instance=new Singleton();

    //私有化构造函数
    private Singleton(){
    }

    //获取实例
    public static Singleton getInstance(){
        return instance;
    }

}
