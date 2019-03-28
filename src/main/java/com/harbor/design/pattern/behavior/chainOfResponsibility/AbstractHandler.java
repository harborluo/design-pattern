package com.harbor.design.pattern.behavior.chainOfResponsibility;

/**
 * Created by HLuo on 3/29/2019.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}