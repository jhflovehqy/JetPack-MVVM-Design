package com.bis.cloudphone.design.strategy;


/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 9:09
 * 说明： 策略模式
 * 定义一个策略，抽取对象中相同的元素点，如此案例，以植物大战僵尸为例，抽取了装饰、移动、攻击等特点
 * 由子类去实现其抽象方法，并通过set方法可以重新定义一些行为动作
 * 接下来的NormalZombie 和 DancingZombie 类也是继承Zombie类，并实现具体的抽象方法及具体实现
 */
public abstract class Zombie {

    protected abstract void move();
    protected abstract void attack();
    protected abstract void earance();
    Moveable moveable;
    Earance earance;
    Attack attack;

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public Earance getEarance() {
        return earance;
    }

    public void setEarance(Earance earance) {
        this.earance = earance;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }
}
