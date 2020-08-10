package com.bis.cloudphone.bridge.defind;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/24 10:30
 * 说明： 封装LiveData  作用与 UnPeekLiveData 相同
 * 防止在当前注册之后继续分发 observer
 * 方式 1 ： 通过反射进行动态修改mLastVersion
 * 方式 2 ： 封装当前  防止分发
 */
public class StickyLiveData<T>  extends LiveData<T> {


    public int mVersion;

    @Override
    protected void setValue(T value) {
        super.setValue(value);
    }


    @Override
    protected void postValue(T value) {
        super.postValue(value);
    }


    @Override
    public void observe(@NonNull LifecycleOwner owner, @NonNull Observer<? super T> observer) {
        super.observe(owner, observer);
        observerSticky(owner , observer , false);
    }

    private void observerSticky(LifecycleOwner owner, Observer<? super T> observer, boolean b) {
        owner.getLifecycle().addObserver(new LifecycleEventObserver() {
            @Override
            public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
                if(event == Lifecycle.Event.ON_DESTROY){

                }
            }
        });

    }
}
