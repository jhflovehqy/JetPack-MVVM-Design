package com.bis.cloudphone.design.template;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 9:57
 * 说明： 模板方法模式
 * 继承AbstractTemplate ， 重新不公共的地方即可
 */
public class Concrete2Template extends AbstractTemplate{

    @Override
    protected void sqliteExec() {
        System.out.println("开始执行删除语句!");
    }
}
