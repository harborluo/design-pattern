package com.harbor.design.pattern.behavior.iterator;

/**
 * Created by HLuo on 3/29/2019.
 */
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
