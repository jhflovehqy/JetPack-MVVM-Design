package com.bis.cloudphone.design.factory;

import android.util.Log;

/**
 * 工厂方法子类 —— 具体工厂 2
 * 持有具体产品 2
 * 负责管理生产怎么样的产品
 * 如果需要从实现类中添加参数
 */
public class ConcreteFactoryB implements AbstractFactoryBound {

    String productName ;

    public ConcreteFactoryB(String productName) {
        this.productName = productName;
    }

    @Override
    public Product newProduct() {
        Log.d("JHF", "newProduct: 具体工厂2——生产具体产品2");
        return new ConcreteProductB(productName);
    }
}
