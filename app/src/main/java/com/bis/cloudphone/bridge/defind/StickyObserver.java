package com.bis.cloudphone.bridge.defind;

import androidx.lifecycle.Observer;

public class StickyObserver<T> implements Observer<T> {

    private StickyLiveData<T> mLiveData;

    private Observer<T> mObserver;

    private boolean isSticky;

    private int mStickyVersion;

    @Override
    public void onChanged(T t) {
        if(mStickyVersion >= mLiveData.mVersion){

        }
    }
}
