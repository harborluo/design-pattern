package com.harbor.design.pattern.behavior.mediator;

/**
 * Created by HLuo on 3/29/2019.
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
