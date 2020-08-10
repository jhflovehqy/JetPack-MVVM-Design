package com.bis.cloudphone.design.flyweight;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 11:28
 * 说明： 享元模式
 * 抽象的享元角色
 * 由子类实现
 */
public interface FlyWeight{

    void operation(ConcreteFlyweight concreteFlyweight);
}
