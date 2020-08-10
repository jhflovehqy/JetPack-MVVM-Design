package com.bis.cloudphone.design.adapter;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 17:52
 * 说明：适配器模式——类适配器
 * -----
 * 类适配器是通过 extends 父类(持有的实现方法)  并 implements 父接口（需要转换的方法）
 * 使得当前适配器类持有需要转换的两个对象
 * -----
 * 缺点是暴露出不需要使用的父类方法  违反了迪米特法则（最少知道原则）
 * -----
 *
 */
public class ClassAdaptee extends AdapterClass implements Target{



    @Override
    public void request() {
        System.out.println("类适配器被调用");
    }
}
