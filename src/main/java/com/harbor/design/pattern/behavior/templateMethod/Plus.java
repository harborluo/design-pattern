package com.harbor.design.pattern.behavior.templateMethod;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}