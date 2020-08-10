package com.bis.cloudphone.design.bridging;

public abstract class Orders {

    Steak steak;

    public Orders(Steak steak) {
        this.steak = steak;
    }

    public abstract void Operation(String type);

}
