package com.harbor.design.pattern.structure.adapter;

/**
 * Created by HLuo on 3/28/2019.
 */
public class WrapperTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }

}
