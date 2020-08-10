package com.bis.cloudphone.design.flyweight;

import com.bis.cloudphone.design.prototype.ProtoTypeTest;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 9:27
 * 说明：享元模式
 */
public class Control {

    /**
     * @param args
     */
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory  = new FlyweightFactory();
        FlyWeight flyWeight1 = flyweightFactory.getFlyWeights("a" ) ;
        FlyWeight flyWeight2 = flyweightFactory.getFlyWeights("a" );
        FlyWeight flyWeight3 = flyweightFactory.getFlyWeights("b");
        FlyWeight flyWeight4 = flyweightFactory.getFlyWeights("b");
        FlyWeight flyWeight5 = flyweightFactory.getFlyWeights("b");
        System.out.println(flyWeight1 == flyWeight3);
        System.out.println(flyWeight3 == flyWeight4);


        flyWeight1.operation(new ConcreteFlyweight("第1次调用!"));
        flyWeight2.operation(new ConcreteFlyweight("第2次调用!"));
    }
}
