package com.bis.cloudphone.design.template;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 9:56
 * 说明： 模板方法模式
 * ------
 * 官方说明:定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，
 * 使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。它是一种类行为型模式。
 *
 */
public class Control {

    public static void main(String[] args) {

        AbstractTemplate abstractTemplate = new ConcreteTemplate();
        abstractTemplate.execSqllite();

        AbstractTemplate abstractTemplate2 = new Concrete2Template();
        abstractTemplate2.execSqllite();
    }


}
