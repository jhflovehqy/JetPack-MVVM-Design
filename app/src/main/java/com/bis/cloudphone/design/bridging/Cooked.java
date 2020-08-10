package com.bis.cloudphone.design.bridging;

public class Cooked extends Orders{
    public Cooked(Steak steak) {
        super(steak);
    }

    @Override
    public void Operation(String type) {
        System.out.println("我选择的熟度："+type);
    }


}
