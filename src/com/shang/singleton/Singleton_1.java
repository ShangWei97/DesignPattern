package com.shang.singleton;

//单例模式（懒汉式）
public class Singleton_1 {
    private static volatile Singleton_1 singleton_1=null;

    private Singleton_1(){
    }

    public static Singleton_1 getInstance(){
       if (singleton_1==null){
           synchronized (Singleton_1.class){
               if (singleton_1==null){
                   singleton_1=new Singleton_1();
               }
           }
       }
       return singleton_1;
    }
}
