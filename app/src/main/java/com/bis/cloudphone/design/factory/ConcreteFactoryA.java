package com.bis.cloudphone.design.factory;

import android.util.Log;

/**
 * 工厂方法子类 —— 具体工厂1
 * 持有具体产品1
 * 负责管理生产怎么样的产品
 */
public class ConcreteFactoryA implements AbstractFactoryBound {

    @Override
    public Product newProduct() {
        Log.d("JHF", "newProduct: 具体工厂1——生产具体产品1");
        return new ConcreteProductA();
    }
}
