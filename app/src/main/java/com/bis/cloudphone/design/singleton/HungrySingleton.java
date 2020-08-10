package com.bis.cloudphone.design.singleton;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/29 10:25
 * 说明： 单例模式 —— 饿汉模式
 * 在类加载时就已经实例化对象，并通过static final 来保证当前类只有一个对象并不可改变
 * 所以当前类是线程安全的，不需要添加同步锁
 */
public class HungrySingleton {


    /**
     * 来保证当前类只有一个对象并不可改变
     * 在类加载时初始化，保证对象创建
     */
    public static final HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * 私有构造方法，防止被外部创建对象
     */
    private HungrySingleton() {

    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}

