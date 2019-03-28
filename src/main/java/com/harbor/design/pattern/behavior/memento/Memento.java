package com.harbor.design.pattern.behavior.memento;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
