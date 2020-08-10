package com.bis.cloudphone.design.proxy;

import androidx.annotation.NonNull;
/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 10:14
 * 说明：  代理模式
 * 被代理的类 —— 实现具体的业务
 */
public class RealSubject implements ISubject{


    @NonNull
    @Override
    public String doSomething() {
        System.out.println("任务1执行中。。。");
        return "RealSubject嘿嘿";
    }
}
