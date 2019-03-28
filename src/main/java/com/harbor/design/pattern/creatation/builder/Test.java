package com.harbor.design.pattern.creatation.builder;

/**
 * Created by HLuo on 3/28/2019.
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
