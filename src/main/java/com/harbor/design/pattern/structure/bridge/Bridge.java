package com.harbor.design.pattern.structure.bridge;

/**
 * Created by HLuo on 3/28/2019.
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

}
