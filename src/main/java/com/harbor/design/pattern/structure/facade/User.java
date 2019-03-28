package com.harbor.design.pattern.structure.facade;

/**
 * Created by HLuo on 3/28/2019.
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
