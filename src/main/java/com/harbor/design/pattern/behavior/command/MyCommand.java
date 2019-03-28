package com.harbor.design.pattern.behavior.command;

/**
 * Created by HLuo on 3/29/2019.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
