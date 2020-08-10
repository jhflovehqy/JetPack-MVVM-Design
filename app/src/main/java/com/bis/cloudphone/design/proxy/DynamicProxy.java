package com.bis.cloudphone.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/5 16:59
 * 说明： 代理模式 —— 动态代理
 * 实现 InvocationHandler 接口来获取代理信息
 */
public class DynamicProxy implements InvocationHandler {

    Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(target.getClass().getName() + "代理模式开启。。。");
        method.invoke(target);
        System.out.println(target.getClass().getName() + "代理模式结束。。。");
        return null;
    }
}
