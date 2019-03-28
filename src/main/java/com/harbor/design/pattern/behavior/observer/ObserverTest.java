package com.harbor.design.pattern.behavior.observer;

/**
 * Created by HLuo on 3/29/2019.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }

}
