package com.bis.cloudphone.design.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 11:34
 * 说明： 享元工厂
 * 用来生产享元对象的工厂
 * 官方说明：享元模式主要是用于减少对象的创建 ， 通过工厂进行数据共享，减少资源的占用
 * -------
 * 什么时候使用呢？
 * 1、系统中有大量对象
 * 2、这些对象消耗大量内存
 * 3、这些对象的状态大部分可以外部化
 * 4、这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替
 * 5、系统不依赖于这些对象身份，这些对象是不可分辨的
 * --------
 * 原理：
 * 需要创建大量对象，将相同的对象放到缓冲池中，需要的时候取对象，不需要重新创建该对象
 * 实例：
 * 普通创建：每次都创建一个message对象
 * Message message = new Message;
 * 享元模式：从缓存池里面取Message对象，不创建
 * Message message = Message.obtain();
 */
public class FlyweightFactory {


    /**
     *
     */
    private Map<String , FlyWeight> flyWeights = new ConcurrentHashMap<>();


    /**
     * @param key
     * @return
     */
    public FlyWeight getFlyWeights(String key) {
        if(flyWeights.containsKey(key)){
            System.out.println("享元数据 " + key + "已经存在，数据为：" + ((FlyWeight)flyWeights.get(key)));
            return flyWeights.get(key);
        }
        FlyWeight flyWeight = new RoleFlyWeight(key);
        flyWeights.put(key , flyWeight);
        return flyWeight;
    }
}
