package com.harbor.design.pattern.creatation.singleton;

/**
 * Created by HLuo on 3/28/2019.
 */
public class SingletonTest {
    private static SingletonTest instance = null;

    private SingletonTest() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

}
