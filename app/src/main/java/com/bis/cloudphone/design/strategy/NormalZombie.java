package com.bis.cloudphone.design.strategy;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/31 16:06
 * 说明：策略模式
 *
 */
public class NormalZombie extends Zombie {

    @Override
    protected void move() {
        System.out.println("僵尸1——开始移动啦");
    }

    @Override
    protected void attack() {
        System.out.println("僵尸1——开始攻击啦");
    }

    @Override
    protected void earance() {
        System.out.println("僵尸1——开始装饰啦");
    }
}
