package com.bis.cloudphone.design.bridging;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 11:22
 * 说明： 桥接模式
 */
public class SirloinSteak implements Steak{
    @Override
    public void addSomething(String something) {
        System.out.println("这是一份沙朗牛排");
    }
}
