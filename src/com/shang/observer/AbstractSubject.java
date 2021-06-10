package com.shang.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author shangwei
 * @date 2021/06/10
 */
public abstract class AbstractSubject implements Subject {

    /**
     * 多线程情况下添加可能造成线程不安全，所以用 {@link Vector}
     * 或者使用性能更好一些的 {@link java.util.concurrent.CopyOnWriteArrayList}
     */
    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }

}
