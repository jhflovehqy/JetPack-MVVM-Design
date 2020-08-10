package com.bis.cloudphone.design.iteration;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 14:53
 * 说明： 迭代器模式
 * ------
 * Cursor (游标)
 * 官方说明:
 * 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示
 * ------
 * 使用迭代器的优势
 * 1. 访问一个聚合对象的内容而无须暴露它的内部表示。
 * 2. 遍历任务交由迭代器完成，这简化了聚合类。
 * 3. 它支持以不同方式遍历一个聚合，甚至可以自定义迭代器的子类以支持新的遍历。
 * 4. 增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 * 5. 封装性良好，为遍历不同的聚合结构提供一个统一的接口。
 */
public class Control {
    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("江西");
        aggregate.add("广东");
        aggregate.add("湖南");
        aggregate.add("福建");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object.toString());
        }

        System.out.println(iterator.first().toString());
    }
}
