package com.bis.cloudphone.design.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 14:51
 * 说明： 组合模式
 * 文件夹 —— 抽象树
 */
public abstract class Dir {

    protected List<Dir> dirs = new ArrayList<>();

    private String name;


    public Dir(String name) {
        this.name = name;
    }

    protected abstract void addDir(Dir dir);
    protected abstract void removeDir(Dir dir);
    protected abstract void clear();
    protected abstract void print();
    protected abstract List<Dir> getDirList();
    public String getName(){
        return name;
    }

}
