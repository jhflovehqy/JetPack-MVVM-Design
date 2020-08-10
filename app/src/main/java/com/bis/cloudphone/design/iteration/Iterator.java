package com.bis.cloudphone.design.iteration;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 15:15
 * 说明： 迭代器模式 ——  抽象接口
 * 一般迭代器的功能都是这样定义
 *
 */
public interface Iterator {
    //第一个
    Object first();
    //下一个
    Object next();
    //是否已经结束迭代
    boolean hasNext();
}
