package com.harbor.design.pattern.behavior.mediator;

/**
 * Created by HLuo on 3/29/2019.
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
