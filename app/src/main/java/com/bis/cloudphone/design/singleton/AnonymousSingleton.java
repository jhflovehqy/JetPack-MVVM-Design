package com.bis.cloudphone.design.singleton;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/29 10:32
 * 说明： 单例模式 —— 匿名内部类
 * 通过匿名内部类进行创建对象
 */
public class AnonymousSingleton {


    /**
     * 匿名内部类
     * 持有AnonymousSingleton对象
     */
    private static class SingletonInstance {
        public static final AnonymousSingleton INSTANCE = new AnonymousSingleton();
    }

    /**
     * 私有构造方法，防止从外部访问re
     */
    private AnonymousSingleton() {
    }

    /**
     * 外部访问对象 ， 持有匿名内部类
     *
     * @return
     */
    public static AnonymousSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
