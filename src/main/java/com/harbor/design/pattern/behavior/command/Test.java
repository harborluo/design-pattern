package com.harbor.design.pattern.behavior.command;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
