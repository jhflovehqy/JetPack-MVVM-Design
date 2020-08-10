package com.bis.cloudphone.design.factory;

import android.util.Log;

/**
 * 具体产品方法 1
 * 由工厂的子类生产
 * 在show方法来表明怎么样生产产品
 */
public class ConcreteProductA implements Product {

    @Override
    public void show() {
        Log.d("JHF", "show: 具体产品1");
    }
}
