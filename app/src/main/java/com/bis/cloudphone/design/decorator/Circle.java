package com.bis.cloudphone.design.decorator;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/31 11:33
 * 说明： 继承绘制接口， 准备绘制圆
 * （2）
 */
public class Circle implements Shape{

    @Override
    public void onDraw() {
        System.out.println("绘制圆形");
    }
}
