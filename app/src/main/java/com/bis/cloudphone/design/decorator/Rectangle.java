package com.bis.cloudphone.design.decorator;

public class Rectangle extends ShapeDecorator{

    public Rectangle(Shape shape) {
        super(shape);
    }

    @Override
    public void onDraw() {
        System.out.println("开始绘制长方形");
        shape.onDraw();
    }
}
