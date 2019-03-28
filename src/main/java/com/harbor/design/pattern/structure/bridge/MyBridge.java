package com.harbor.design.pattern.structure.bridge;

/**
 * Created by HLuo on 3/28/2019.
 */
public class MyBridge extends Bridge {

    public void method(){
        getSource().method();
    }

}
