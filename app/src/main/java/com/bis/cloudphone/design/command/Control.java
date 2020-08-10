package com.bis.cloudphone.design.command;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 16:55
 * 说明： 命令模式
 * ------
 * 命令模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开
 * 这样两者之间通过命令对象进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理。
 *
 * ------
 * 我的理解：
 * 感觉像是通过一个中转站一样，Request 是最终执行到的方法 ， 有点像代理模式
 * ConcreteCommand 方法是负责调用Request 中的方法
 * 而Invoker 方法持有ConcreteCommand ， 但是你需要去配置Command类 ， 如果以后你想命令其他的类，你只需要实现Command接口就行啦
 */
public class Control {


    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.command();
        System.out.println("开始调用command==");

    }
}
