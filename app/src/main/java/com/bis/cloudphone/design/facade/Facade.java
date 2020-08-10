package com.bis.cloudphone.design.facade;


/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 17:04
 * 说明： 外观模式 （门面模式）
 *
 */
public class Facade {



    SubSystem1 subSystem1 = new SubSystem1();
    SubSystem2 subSystem2 = new SubSystem2();

    public void method(){
        subSystem1.method();
        subSystem2.method();
    }
}
