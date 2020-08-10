package com.bis.cloudphone.design.iteration;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 15:41
 * 说明： 迭代器模式
 * 迭代器包装类的具体实现 ——
 *
 */
public class ConcreteAggregate implements Aggregate{

    private List<Object> list=new ArrayList<Object>();
    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    /**
     * 将参数放到迭代器中，通过执行迭代器中的迭代方法来遍历
     * @return
     */
    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
