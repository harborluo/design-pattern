package com.harbor.design.pattern.behavior.visitor;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Visitor {
    public void process(Service service) {
        // 基本业务
        System.out.println("基本业务");
    }

    public void process(Saving service) {
        // 存款
        System.out.println("存款");
    }

    public void process(Draw service) {
        // 提款
        System.out.println("提款");
    }

    public void process(Fund service) {
        System.out.println("基金");
        // 基金
    }
}
