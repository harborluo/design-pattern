package com.harbor.design.pattern.creatation.singleton;

/**
 * Created by HLuo on 3/28/2019.
 */
public class SingletonV4 {

    private SingletonV4(){

    }

    private static SingletonV4 instance = new SingletonV4();

    public static SingletonV4 getInstance(){
        return SingletonV4.instance;
    }

}
