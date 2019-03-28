package com.harbor.design.pattern.creatation.simpleFactory;

/**
 * Created by HLuo on 3/28/2019.
 */
public class StaticSendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        Sender sender = StaticSendFactory.produceMail();
        sender.send();
    }
}
