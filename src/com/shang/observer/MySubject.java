package com.shang.observer;

/**
 * 实现主体的操作方法
 *
 * @author shangwei
 */
public class MySubject extends SubjectAbstract {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
