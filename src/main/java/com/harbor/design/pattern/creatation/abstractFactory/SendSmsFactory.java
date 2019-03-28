package com.harbor.design.pattern.creatation.abstractFactory;

/**
 * Created by HLuo on 3/28/2019.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
    
}
