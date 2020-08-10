package com.bis.cloudphone.design.builder;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 9:14
 * 说明： 建造者模式
 * 官方说明：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式
 * 通过Build类来配置所需要用到的参数
 * 调用builder()方法时代表以及组装好了，可以展示了
 * Retrofit 和 AlertDialog 就是典型的构造者模式
 */
public class DesignMatter {

    private final static int VERSION = 1000;
    private Integer color;
    private String data;
    private String size;
    private Integer drawable;

    public DesignMatter() {
    }

    /**
     * {@link DesignMatter} 通过构造方法
     * 给builder()方法调用
     * @param color
     * @param data
     * @param size
     * @param drawable
     */
    public DesignMatter(Integer color, String data, String size, Integer drawable) {
        this.color = color;
        this.data = data;
        this.size = size;
        this.drawable = drawable;
    }

    /**
     * 实现一些业务
     * @param tClass
     */
    public void create(Class<?> tClass){

    }


    /**
     * 建造者，负责组装
     */
    static final class Builder {
        private Integer color;
        private String data;
        private String size;
        private Integer drawable;


        public Builder setColor(Integer color) {
            this.color = color;
            return this;
        }

        /**
         * {@link Builder} retrun this 链式调用
         * @param data
         * @return
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setDrawable(Integer drawable) {
            this.drawable = drawable;
            return this;
        }

        /**
         * 在配置好参数之后，通过build将对象返回，并传入构造参数
         * 以此来建造对象
         * @return
         */
        public DesignMatter build() {
            return new DesignMatter(color, data, size, drawable);
        }
    }

}
