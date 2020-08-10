package com.bis.cloudphone.design.observer;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 10:07
 * 说明： 观察者模式
 */
public class ConcreteObserver2 implements Observer{
    @Override
    public void update() {
        System.out.println("开始更新数据 ==== 2");
    }
}
