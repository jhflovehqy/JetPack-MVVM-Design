package com.bis.cloudphone.design.factory;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/29 10:44
 * 作用 ： 工厂方法模式
 * 示例 ： 实现工厂方法模式
 */
public class AbstractFactory {


    public static void createFactory(){
        //抽象工厂1
        AbstractFactoryBound abstractFactoryBound1 = new ConcreteFactoryA();
        Product product1 = abstractFactoryBound1.newProduct();
        product1.show();
        //抽象工厂2
        AbstractFactoryBound abstractFactoryBound2= new ConcreteFactoryB("factory");
        Product product2 = abstractFactoryBound2.newProduct();
        product2.show();

    }

}











































