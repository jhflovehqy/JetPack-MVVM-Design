package com.bis.cloudphone.design.factory;

/**
 * 作用 ： 工厂方法模式
 * 工厂基类 抽象接口
 *  由子类实现 ， 决定它能生产的产品
 * 新增类时，需要添加子类实现newProduct() 方法来创建产品
 */
public interface AbstractFactoryBound {
    Product newProduct();
}
