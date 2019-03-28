package com.harbor.design.pattern.behavior.observer;

/**
 * Created by HLuo on 3/29/2019.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
