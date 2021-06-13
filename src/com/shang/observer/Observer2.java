package com.shang.observer;

/**
 * 观察者2
 *
 * @author shangwei
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer2 has received!");
    }
}
