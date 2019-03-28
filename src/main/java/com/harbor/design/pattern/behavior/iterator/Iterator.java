package com.harbor.design.pattern.behavior.iterator;

/**
 * Created by HLuo on 3/29/2019.
 */
public interface Iterator {
    //前移
    public Object previous();

    //后移
    public Object next();

    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
