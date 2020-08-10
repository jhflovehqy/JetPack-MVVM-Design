package com.bis.cloudphone.design.singleton;

import android.os.Message;

import java.lang.ref.WeakReference;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/29 9:45
 * 说明： 单例模式——懒汉模式
 * 保证一个项目中只创建一个实例
 * 单例模式类一定保证创建该对象一定在该类中实现
 */
public class LazySingleton {


    /**
     * volatile 方法保证INSTANCE在所有线程中同步
     */
    public volatile static LazySingleton INSTANCE;

    /**
     * 提供空的私有构造方法，防止在外部创建改类
     * LazyManSingle lazyManSingle = new LazyManSingle();
     */
    private LazySingleton() {
    }

    /**
     * 对外提供访问该单例对象的实例类
     * 在第一次调用该方法中，该类对象才会被创建
     * synchronized : 使用synchronized关键字能保证在多个线程访问该线程对象时添加同步锁
     *                防止并发线程在未创建对象时，就已经将改对象返回
     *                若其他线程访问时，将会被阻塞
     *                每个对象只有一把同步锁哦
     * 但是每次访问时都需要同步，会消耗更多的资源
     *  至于为什么不在方法中添加synchronized ， 是因为方法中添加相当于给整个方法添加了同步锁，
     *  锁对象时只会对一个代码块进行锁定 ， 其他内容还是可以访问
     * @return
     */
    public static LazySingleton getInstance(){
        if(INSTANCE == null){
            synchronized (LazySingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }

}
