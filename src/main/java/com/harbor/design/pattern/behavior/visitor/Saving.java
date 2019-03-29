package com.harbor.design.pattern.behavior.visitor;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Saving implements Service {

    @Override
    public void accept(Visitor visitor) {
        visitor.process(this);
    }

}