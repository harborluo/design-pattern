package com.harbor.design.pattern.creatation.singleton;

/**
 * Created by HLuo on 3/28/2019.
 */
public class SingletonV2 {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonV2 instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonV2() {
    }

    /* 静态工程方法，创建实例 */
    public static synchronized SingletonV2 getInstance() {
        if (instance == null) {
            instance = new SingletonV2();
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}  
