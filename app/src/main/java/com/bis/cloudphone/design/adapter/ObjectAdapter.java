package com.bis.cloudphone.design.adapter;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/30 17:37
 * 说明： 适配器模式 - 对象适配器
 * -----
 * 官方说明：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作
 * -----
 * 对象适配器比较常用
 * 在Android中，经常用于给各种控件设置适配器，不需要关心View的操作，对控件数据显示进行适配即可
 * 在Android中的经典应用
 * ArrayAdapter arrayAdapter = new ArrayAdapter(this , new String[]{});
 * ListView listView = new ListView(this);
 * listView.setAdapter(arrayAdapter);
 */
public class ObjectAdapter implements Target {


    AdapterClass adapterClass;

    public ObjectAdapter(AdapterClass adapterClass) {
        this.adapterClass = adapterClass;
    }

    @Override
    public void request() {
        adapterClass.test();
    }
}
