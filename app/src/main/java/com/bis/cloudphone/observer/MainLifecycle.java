package com.bis.cloudphone.observer;

import com.bis.cloudphone.ui.viewmodel.MainViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
/**
 * username 江海锋
 * createtime 2020/6/3 9:41
 * lifecycle 跟随activity生命周期变化
 * 减少代码入侵  简化activity功能
 * activity 负责调用
 * 如GPS定位、控件动画等需要在activity销毁时一起销毁的动作
 * 通过在activity中添加  getLifecycle().addObserver()来实现
 */
public class MainLifecycle implements DefaultLifecycleObserver {

    public static MainLifecycle L_MAIN;
    MainViewModel mainViewModel;


    public MainLifecycle(MainViewModel mainViewModel) {
        this.mainViewModel = mainViewModel;
    }

    public static MainLifecycle getInstance(MainViewModel mainViewModel){
        if(L_MAIN == null){
            synchronized (MainLifecycle.class){
                if(L_MAIN == null){
                    return new MainLifecycle(mainViewModel);
                }
            }
        }
        return L_MAIN;
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {

    }


    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {

    }
}
