package com.bis.cloudphone.design.decorator;

public class Diamond extends ShapeDecorator{

    public Diamond(Shape shape) {
        super(shape);
    }

    @Override
    public void onDraw() {
        System.out.println("绘制菱形!");
        shape.onDraw();
    }
}
