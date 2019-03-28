package com.harbor.design.pattern.behavior.iterator;

/**
 * Created by HLuo on 3/29/2019.
 */
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
