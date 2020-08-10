package com.bis.cloudphone.design.observer;

import android.view.View;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 10:20
 * 说明：
 */
public class SubjectObserver extends Subject{
    @Override
    public void notofyAll() {
        System.out.println("开始更新啦");
        for (Observer observers : mObserver){
            observers.update();
        }
    }
}
