package com.bis.cloudphone.design.combination;

import java.util.Iterator;
import java.util.List;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 14:51
 * 说明： 组合模式
 * 文件夹 —— 节点
 */
public class Folder extends Dir{


    public Folder(String name) {
        super(name);
    }

    @Override
    protected void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    protected void removeDir(Dir dir) {
        dir.removeDir(dir);
    }


    @Override
    protected void clear() {
        dirs.clear();
    }

    @Override
    protected void print() {
        //利用递归来输出文件夹结构
        System.out.print(getName()+"/");
        Iterator<Dir> i = dirs.iterator();
        while (i.hasNext()){
            Dir dir = i.next();
            dir.print();
        }
        System.out.print("/");
    }

    @Override
    protected List<Dir> getDirList() {
        return dirs;
    }
}
