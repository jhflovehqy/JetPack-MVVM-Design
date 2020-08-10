package com.bis.cloudphone.design.prototype;

import java.io.Serializable;

import androidx.annotation.NonNull;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 9:49
 * 说明： 原型模式
 * 官方说明：原型实例指定创建对象的种类， 并且通过拷贝这些原型创建新的对象
 * 总得来说，原型模式的作用就是拷贝对象，不通过new 的方式创建对象，节省内存资源和时间
 * 相当于copy对象，在日常生活中也经常用到
 * Java 用来实现原型模式的方法很简单， 只需要在copy的对象中实现当前的Cloneable接口，就可以实现原型模式
 * Cloneable 接口和Serializable一样，只是一个空的接口，用来标记当前类
 */
public class ProtoTypeTest implements Cloneable, Serializable {


    public String part1;
    public String part2;
    public String part3;
    public String part4;
    /**
     * Cloneable 下的所有的可变数据（除了基本类型之外），都需要实现Cloneable接口
     */
    public BaseInfo baseInfo;

    //....其他业务
    public ProtoTypeTest(String part1, String part2, String part3, String part4, BaseInfo baseInfo) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
        this.baseInfo = baseInfo;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    public void setPart4(String part4) {
        this.part4 = part4;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    /**
     * @return clone 克隆方法 {@linkplain Cloneable}
     * @throws CloneNotSupportedException
     */
    @NonNull
    @Override
    protected ProtoTypeTest clone() {
        /*
         * 在返回 super.clone() 之前打印的数据
         *  hashCode：1927950199 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4', baseinfo='hashCode：868693306 BaseInfo{companyName='info1'}'}
         *  hashCode：1746572565 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4', baseinfo='hashCode：989110044 BaseInfo{companyName='info1'}'}
         *  hashCode：1927950199 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4', baseinfo='hashCode：868693306 BaseInfo{companyName='info2'}'}
         *  hashCode：1746572565 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4', baseinfo='hashCode：989110044 BaseInfo{companyName='info2'}'}
         *  在修改了 super.clone() 之后打印的数据
         *  区别在于如果返回super.clone()，那么拷贝的原始数据会随着数据的变化改变
         *  不能保证数据的不可变性
         *  hashCode：1927950199 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4', baseinfo='hashCode：868693306 BaseInfo{companyName='info1'}'}
         *  hashCode：1746572565 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4', baseinfo='hashCode：989110044 BaseInfo{companyName='info1'}'}
         *  hashCode：1927950199 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4', baseinfo='hashCode：868693306 BaseInfo{companyName='info2'}'}
         *  hashCode：1746572565 ProtoTypeTest{part1='xx1', part2='xx2', part3='xx3', part4='xx4', baseinfo='hashCode：989110044 BaseInfo{companyName='info1'}'}
         *  所以需要在数据拷贝时，拷贝原始的baseinfo 数据，用来保证数据的不变性
         *  需要在baseinfo中实现当前的clone接口
         */
        try {
            ProtoTypeTest clone1 = (ProtoTypeTest) super.clone();
            BaseInfo baseInfo = this.baseInfo.clone();
            clone1.setBaseInfo(baseInfo);
            return clone1;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 打印数据
     * @return
     */
    @Override
    public String toString() {
        return "hashCode：" + super.hashCode() + " ProtoTypeTest{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                ", part4='" + part4 + '\'' +
                ", baseinfo='" + baseInfo + '\'' +
                '}';
    }

    /**
     * {@linkplain BaseInfo}
     * 可变数据，由ProtoTypeTest持有该类 ， 实现Cloneable 接口
     * 实现Serializable 接口保证序列化，在输入输出流时需要对数据进行包装
     */
    static class BaseInfo implements Cloneable , Serializable{
        public String companyName;

        public BaseInfo(String companyName) {
            this.companyName = companyName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        /**
         * 实现
         * @return
         */
        @NonNull
        @Override
        protected BaseInfo clone() {
            try {
                return (BaseInfo) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }

        /**
         * 打印当前hashCode
         *
         * @return
         */
        @Override
        public String toString() {
            return "hashCode：" + super.hashCode() + " BaseInfo{" +
                    "companyName='" + companyName + '\'' +
                    '}';
        }
    }
}
