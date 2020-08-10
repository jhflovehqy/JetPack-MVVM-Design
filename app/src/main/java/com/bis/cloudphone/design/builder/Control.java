package com.bis.cloudphone.design.builder;
/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 9:27
 * 说明：构造者模式
 * 通过链式调用构建建造者
 * 可以查看AlertDialog 和 Retrofit 源码来查看构造者模式
 */
public class Control {

    public static void main(String[] args) {

        new DesignMatter.Builder()
                .setColor(1)
                .setData("xxx")
                .setDrawable(1)
                .setSize("xxx")
                .build()
                .create(DesignMatter.class);
    }
}
