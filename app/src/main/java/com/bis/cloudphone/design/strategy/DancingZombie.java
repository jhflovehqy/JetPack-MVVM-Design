package com.bis.cloudphone.design.strategy;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 9:05
 * 说明： 定义一个跳舞僵尸
 * 继承Zombie ， 实现其抽象方法
 */
public class DancingZombie extends Zombie{
    @Override
    protected void move() {
        System.out.println("跳舞僵尸——开始移动啦");
    }

    @Override
    protected void attack() {
        System.out.println("跳舞僵尸——开始攻击啦");
    }

    @Override
    protected void earance() {
        System.out.println("跳舞僵尸——开始装饰啦");
    }
}
