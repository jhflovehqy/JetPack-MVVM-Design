package com.bis.cloudphone.design.combination;

import java.util.List;

/**
 * 作者： 江海锋 
 * 添加时间： 2020/8/7 14:09
 * 说明： 组合模式
 * 具体的文件
 */
public class File extends Dir{
    
    public File(String name) {
        super(name);
    }

    @Override
    protected void addDir(Dir dir) {
        System.out.println("文件不支持此操作");
    }

    @Override
    protected void removeDir(Dir dir) {
        System.out.println("文件不支持此操作");
    }

    @Override
    protected void clear() {
        System.out.println("文件不支持此操作");
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    protected List<Dir> getDirList() {
        System.out.println("文件不支持此操作");
        return null;
    }
}
