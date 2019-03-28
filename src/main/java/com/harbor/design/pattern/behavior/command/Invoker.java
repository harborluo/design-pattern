package com.harbor.design.pattern.behavior.command;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
