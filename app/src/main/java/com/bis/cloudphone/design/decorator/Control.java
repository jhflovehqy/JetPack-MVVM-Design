package com.bis.cloudphone.design.decorator;
/**
 * 作者： 江海锋
 * 添加时间： 2020/7/31 10:30
 * 说明： 装饰器模式
 * -----
 * 官方说明：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式
 * -----
 * 优点： 1.不改变原有对象的情况下给一个对象扩展功能
 *       2.使用不同的组合可以实现不同的效果
 *       3.符合开闭原则
 * -----
 * 问题：为什么不使用继承呢？
 *
 */
public class Control {


    public static void main(String[] args) {

        /**
         * 1.只绘制圆
         */
//        Shape circle = new Circle();
//        circle.onDraw();

        /**
         * 需求：需要绘制圆和长方形
         * 2. 绘制圆 和 长方形
         * 定义一个中转的抽象类， 持有Shape 绘制接口
         * 添加类ShapeDecorator 中转
         * 添加类Rectangle 继承 ShapeDecorator 并实现新的内容
         */

//        Shape circleOrRectangle = new Rectangle(new Circle());
//        circleOrRectangle.onDraw();

        /**
         * 需求：需要绘制圆和长方形
         * 3. 绘制圆 和 长方形 和 菱形
         * 添加类Diamond
         */
//        Shape circleOrRectangle1 = new Diamond( new Rectangle(new Circle()));
//        circleOrRectangle1.onDraw();

        /**
         * 需求：需要绘制圆和长方形
         * 4. 绘制圆 和 菱形 和 长方形
         * 添加类Diamond
         */
        Shape circleOrRectangle2 = new Rectangle( new Diamond(new Circle()));
        circleOrRectangle2.onDraw();

    }

}
