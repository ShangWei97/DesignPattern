package com.shang.observer;

/**
 * 观察者1
 *
 * @author shangwei
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1 has received!");
    }
}
