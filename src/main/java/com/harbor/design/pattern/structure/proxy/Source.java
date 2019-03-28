package com.harbor.design.pattern.structure.proxy;

/**
 * Created by HLuo on 3/28/2019.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }

}
