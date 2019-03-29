package com.harbor.design.pattern.behavior.visitor;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Fund implements Service {

    public void accept(Visitor visitor) {
        visitor.process(this);

    }
}
