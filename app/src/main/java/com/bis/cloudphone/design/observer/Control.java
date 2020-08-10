package com.bis.cloudphone.design.observer;

/**
 * 作者： 江海锋 
 * 添加时间： 2020/8/3 10:05
 * 说明： 观察者模式
 * ------
 * 官方说：指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 这种模式有时又称作发布-订阅模式、模型-视图模式，它是对象行为型模式
 * ------
 * 总得来说，就是一句话：一处发送，多处更新
 * 最简单的例子：Rxjava 、 LiveData
 * 都是使用了观察者模式
 * ------
 */
public class Control {

    public static void main(String[] args) {

        Subject subject = new SubjectObserver();
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        subject.addObserver(concreteObserver1, new ConcreteObserver2());
        subject.notofyAll();
        //删除数据1
        subject.removeObserver(concreteObserver1);
        subject.notofyAll();
    }
}
