package com.bis.cloudphone.design.flyweight;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 11:32
 * 说明： 具体享元角色
 * FlyWeight 子类
 */
public class RoleFlyWeight implements FlyWeight {
    private String key;

    public RoleFlyWeight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(ConcreteFlyweight concreteFlyweight) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + concreteFlyweight.getInfo());
    }
}
