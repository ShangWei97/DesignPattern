package com.shang.observer;

/**
 * 观察者模式测试
 *
 * @author shangwei
 * @date 2021/06/10
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        sub.add(observer1);
        sub.add(observer2);
        sub.operation();
        sub.del(observer2);
        sub.operation();
    }
}
