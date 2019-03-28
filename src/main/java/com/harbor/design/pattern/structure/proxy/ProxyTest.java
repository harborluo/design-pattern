package com.harbor.design.pattern.structure.proxy;

/**
 *
 * Created by HLuo on 3/28/2019.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
