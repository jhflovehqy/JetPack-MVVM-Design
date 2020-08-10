package com.bis.cloudphone.design.prototype;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 9:27
 * 说明：建造者模式
 * 通过链式调用构建建造者
 * 可以查看AlertDialog 和 Retrofit 源码来查看构造者模式
 */
public class Control {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ProtoTypeTest.BaseInfo baseInfo = new ProtoTypeTest.BaseInfo("info1");
        ProtoTypeTest protoTypeTest  = new ProtoTypeTest("xx1" , "xx2" , "xx3" , "xx4" , baseInfo);
        ProtoTypeTest protoTypeTest1 = protoTypeTest.clone();
        System.out.println(protoTypeTest.toString());
        System.out.println(protoTypeTest1.toString());

        /**
         * 克隆结果
         * hashCode：1927950199 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4'}
         * hashCode：868693306 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4'}
         */


        /**
         * 改变原始对象的数据，则后面copy的对象数据也会改变，后面copy的对象就已经不是原对象数据了
         * 为了保证数据还是原始的数据，所以应该在改类下的所有的可变数据都进行拷贝
         */
        protoTypeTest.getBaseInfo().setCompanyName("info2");
        System.out.println(protoTypeTest.toString());
        System.out.println(protoTypeTest1.toString());



    }
}
