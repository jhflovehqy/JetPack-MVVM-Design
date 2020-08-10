package com.bis.cloudphone.design.decorator;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/31 11:37
 * 说明： 用来中转的类，持有Shape绘制接口
 * 如果要添加新绘制的东西，只需要继承这个类就行了啊
 * -----
 * （3）
 */
public abstract class ShapeDecorator implements Shape{


    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

}
