package com.harbor.design.pattern.behavior.mediator;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
