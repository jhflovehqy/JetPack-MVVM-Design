package com.bis.cloudphone.design.proxy;

import androidx.annotation.NonNull;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 10:18
 * 说明： 代理模式——动态代理
 * 业务类二
 * 使用动态代理类，每次都只需要添加一个业务类，无需添加代理类
 * 而静态代理类需要添加业务类和代理类 ， 哪个方便当然是浅显易懂
 */
public class TaskSubject implements ISubject{


    @NonNull
    @Override
    public String doSomething() {
        System.out.println("我也想要执行这个任务呀");
        return "TaskSubject嘿嘿";
    }
}
