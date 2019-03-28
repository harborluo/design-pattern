package com.harbor.design.pattern.behavior.strategy;

/**
 * Created by HLuo on 3/28/2019.
 */
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
