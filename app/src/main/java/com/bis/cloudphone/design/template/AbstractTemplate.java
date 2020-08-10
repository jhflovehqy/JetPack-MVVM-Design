package com.bis.cloudphone.design.template;

/**
 * 作者： 江海锋 
 * 添加时间： 2020/8/3 9:48
 * 说明： 模板方法模式
 * -----
 * 官方说明：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
 * 它是一种类行为型模式。
 * -----
 * 模拟数据库的一些操作，将数据库连接、关闭等重复性的、必须的工作只写一遍 ， 只需执行sql命令的方法即可
 * -----
 * 1.定义流程，找出可以复用和不能复用的方法
 * 2.将不能复用的方法放到抽象类中
 * 3.定义子类继承AbstractTemplate ， 只需要执行不能复用的方法 ， 相当于创建一个模板
 */
public abstract class AbstractTemplate {


    /**
     * 执行sql命令
     * 其中的操作有 数据库连接 、 数据库执行 、 数据库关闭
     */
    public void execSqllite(){
        sqliteConnect();
        sqliteExec();
        sqliteClose();
    }

    /**
     * 数据库关闭
     */
    private void sqliteClose() {
        System.out.println("关闭数据库");
    }

    /**
     * 数据库连接
     */
    private void sqliteConnect() {
        System.out.println("连接数据库");
    }

    /**
     * 数据库执行命令
     */
    protected abstract void sqliteExec();


}
