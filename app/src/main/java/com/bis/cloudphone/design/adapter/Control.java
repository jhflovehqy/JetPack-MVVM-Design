package com.bis.cloudphone.design.adapter;

import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 17:45
 * 说明：
 */
public class Control {


    public static void main(String[] args) {

        /**
         *  对象适配器模式
         */
        AdapterClass adapterClass = new AdapterClass();
        ObjectAdapter objectAdapter = new ObjectAdapter(adapterClass);
        objectAdapter.request();



        /**
         * 类适配器模式
         */
        ClassAdaptee classAdaptee = new ClassAdaptee();
        classAdaptee.request();
    }

}
