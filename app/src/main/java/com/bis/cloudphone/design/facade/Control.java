package com.bis.cloudphone.design.facade;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 17:04
 * 说明：
 * -----
 * 官方说明：是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。
 * 该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体的细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
 *
 * -----
 * 原理：需要同时调用不同类的方法时，封装通过一个方法可以一次性调用多个方法
 * 总得来说，就是封装代码
 */

public class Control {


    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();



    }
}
