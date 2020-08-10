package com.bis.cloudphone.design.proxy;


/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 10:14
 * 说明： 代理模式 -- 静态代理类
 *
 * 代理类 ， 中间人的角色
 * 静态代理业务类和代理类都需要继承同一个抽象接口
 * 静态代理的实现每增加一个业务，都需要一个业务类和代理类 ， 所有的代理类都是已知的
 * 为了减少代码的耦合，所以一般都是使用动态代理的方式
 * 比如说retrofit
 */
public class StaticProxy implements ISubject{

    private ISubject iSubject ;

    /**
     * 传入一个具体业务对象
     * @param iSubject
     */
    public StaticProxy(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    /**
     * 抽象实现， 代理业务类的doSomething 方法
     * @return
     */
    @Override
        public String doSomething() {
        System.out.println("代理开始");
        iSubject.doSomething();
        System.out.println("代理结束");
        return "动态代理测试";
    }
}
