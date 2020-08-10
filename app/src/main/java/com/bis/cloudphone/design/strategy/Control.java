package com.bis.cloudphone.design.strategy;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 9:17
 * 说明： 策略模式： 要想实现策略模式，前提条件是有相同的部分，实现部分可以不一样
 * -------
 * 官方说明：该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户
 * 策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 * -------
 * 实现过程：
 * 1.找出相同的部分，定义成接口
 * 2.定义一个抽象类，把接口放到抽象类中管理
 * 3.扩展类（子类）继承抽象类，并实现具体的抽象方法
 */
public class Control {


    public static void main(String[] args) {

        Zombie normalZombie = new NormalZombie();
        normalZombie.earance();
        normalZombie.move();
        normalZombie.attack();

        Zombie normalZombie1 = new DancingZombie();
        normalZombie1.earance();
        normalZombie1.move();
        normalZombie1.attack();
    }
}
