package com.harbor.design.pattern.behavior.observer;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }

}
