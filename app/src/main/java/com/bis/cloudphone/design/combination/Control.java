package com.bis.cloudphone.design.combination;

/**
 * 作者： 江海锋 
 * 添加时间： 2020/8/7 14:49
 * 说明： 组合模式
 * ------
 * 官方说明：将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
 * ------
 * 使用场景
 * 想表示对象的部分-整体层次结构时。
 * 希望用户忽略单个对象和组合对象的不同，对对象使用具有统一性时。
 * 从一个整体中能够独立出部分模块或功能时
 * 一般来说，使用组合模式的场景并不多
 * 具体的像是View 和 ViewGroup
 * 是一个树形结构体 ， ViewGroup是节点 View是树根节点
 * 一个节点可以包括多个根节点和节点，  如果循环组合
 *
 */
public class Control {


    public static void main(String[] args) {


        Dir sdcard = new Folder("sdcard");
        sdcard.addDir(new File("sdcard.log"));
        Dir system = new Folder("system");
        system.addDir(new File("systemlog.txt"));
        sdcard.addDir(system);
        Dir user = new Folder("user");
        user.addDir(new Folder("usernamelog.txt"));
        sdcard.addDir(user);
        sdcard.print();

    }
}
