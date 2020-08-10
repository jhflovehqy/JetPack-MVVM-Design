package com.bis.cloudphone.design.memorandum;
/**
 * 作者： 江海锋
 * 添加时间： 2020/8/10 14:26
 * 说明： 备忘录模式
 *
 * -----
 * 官方说明 - 角色分配
 * Originator：负责创建一个备忘录，可以记录，恢复自身内部的状态。同时可以决定哪些状态需要备忘。
 * Memoto：备忘录角色，用于存储Originator的内部状态，并且可以防止Originator之外的对象访问Memoto。
 * Caretaker：负责存储备忘录，不能对备忘录的内容进行操作和访问，只能讲备忘录传递给其他对象。
 * -----
 * 我的理解
 * 感觉这种模式是用于存档记录的，也可以用来返回上一步这样子
 */
public class Control {


    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        //第一次设置状态
        originator.setStatus("设置初始化状态");
        System.out.println(originator.getStatus());
        //修改后的状态
        caretaker.setMemento(originator.createMemento());
        originator.setStatus("设置新的状态");
        System.out.println(originator.getStatus());
        //撤回后的状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getStatus());

        //修改后的状态
        caretaker.setMemento(originator.createMemento());
        originator.setStatus("第二种状态");
        System.out.println(originator.getStatus());
        //撤回后的状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getStatus());
    }
}

