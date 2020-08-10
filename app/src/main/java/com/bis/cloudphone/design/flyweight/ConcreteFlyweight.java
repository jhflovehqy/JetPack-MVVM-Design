package com.bis.cloudphone.design.flyweight;

/**
 * 作者： 江海锋 
 * 添加时间： 2020/7/30 14:01
 * 说明： 非享元角色
 * 数据层，module
 */
public class ConcreteFlyweight {

    private String info;

    public ConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return  "hashCode ： " + super.hashCode() + "ConcreteFlyweight{" +
                "info='" + info + '\'' +
                '}';
    }
}
