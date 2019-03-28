package com.harbor.design.pattern.structure.adapter;

/**
 * Created by HLuo on 3/28/2019.
 * 这样Targetable接口的实现类就具有了Source类的功能。
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

}
