package com.harbor.design.pattern.behavior.interpreter;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
