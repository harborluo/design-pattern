package com.harbor.design.pattern.structure.decorator;

/**
 * 可以为Source类动态的添加一些功能
 * Created by HLuo on 3/28/2019.
 */
public class Decorator  implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
