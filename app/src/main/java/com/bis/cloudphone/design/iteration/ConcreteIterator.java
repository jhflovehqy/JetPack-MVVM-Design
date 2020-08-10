package com.bis.cloudphone.design.iteration;

import java.util.List;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 15:38
 * 说明： 迭代器模式
 * -------
 * Iterator 的具体实现
 * 通过索引可以知道当前迭代器的执行位置
 */
public class ConcreteIterator implements Iterator{

    List<Object> objects;
    private int index = -1;

    public ConcreteIterator(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    public Object first() {
        index = 0;
        Object object = objects.get(index);
        return object;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            index++;
            return objects.get(index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < objects.size() -1 ;
    }
}
