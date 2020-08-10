package com.bis.cloudphone.design.command;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 17:01
 * 说明：命令模式
 * 负责执行最后的方法
 */
class ConcreteCommand implements Command {


    private Request request;

    public ConcreteCommand() {
        request = new Request();
    }

    @Override
    public void call() {
        request.exec();
        System.out.println("开始执行call == ");
    }
}
