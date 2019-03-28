package com.harbor.design.pattern.behavior.interpreter;

/**
 * 最后输出正确的结果：3。
 基本就这样，解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
 * Created by HLuo on 3/29/2019.
 */
public class Test {
    public static void main(String[] args) {

        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
