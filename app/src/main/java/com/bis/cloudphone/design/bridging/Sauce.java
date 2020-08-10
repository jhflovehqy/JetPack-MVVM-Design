package com.bis.cloudphone.design.bridging;

public class Sauce extends Orders{

    public Sauce(Steak steak) {
        super(steak);
    }

    @Override
    public void Operation(String type) {
        this.steak.addSomething(type);
        System.out.println("我选择的牛排汁："+type);
    }

}
