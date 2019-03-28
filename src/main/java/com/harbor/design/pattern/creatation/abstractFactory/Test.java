package com.harbor.design.pattern.creatation.abstractFactory;

/**
 * Created by HLuo on 3/28/2019.
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }

}
