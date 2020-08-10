package com.bis.cloudphone.design.iteration;


/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 15:40
 * 说明： 迭代器模式
 * ------
 * 迭代器的包装类  —— 抽象接口
 */
public interface Aggregate {
    //添加(迭代器操作)
    void add(Object object);
    //删除(迭代器操作)
    void remove(Object object);
    //获取当前迭代器
    Iterator getIterator();
}
