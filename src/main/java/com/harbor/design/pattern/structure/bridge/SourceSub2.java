package com.harbor.design.pattern.structure.bridge;

/**
 * Created by HLuo on 3/28/2019.
 */
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }

}
