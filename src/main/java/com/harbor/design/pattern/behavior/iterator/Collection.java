package com.harbor.design.pattern.behavior.iterator;

/**
 * Created by HLuo on 3/29/2019.
 */
public interface Collection {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
