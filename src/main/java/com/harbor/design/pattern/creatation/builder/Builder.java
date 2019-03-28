package com.harbor.design.pattern.creatation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HLuo on 3/28/2019.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }

}
