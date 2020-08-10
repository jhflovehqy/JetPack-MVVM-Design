package com.bis.cloudphone.design.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 10:14
 * 说明：观察者模式
 * 定义抽象管理类 ， 负责添加和删除观察者
 * 子类实现notofyAll ， 负责更新数据
 */
public abstract class Subject {
    public List<Observer> mObserver = new ArrayList<>();

    /**
     * 添加observer
     */
    public void addObserver( Observer observer) {
        mObserver.add(observer);
    }

    /**
     * 添加多个observer
     * @param observers
     */
    public void addObserver(Observer... observers){
        mObserver.addAll(Arrays.asList(observers));
    }

    /**
     * 删除observer
     */
    public void removeObserver( Observer observer){
        mObserver.remove(observer);
    }

    /**
     * 更新
     */
    public abstract void notofyAll();
}
