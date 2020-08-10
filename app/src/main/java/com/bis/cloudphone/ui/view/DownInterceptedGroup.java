package com.bis.cloudphone.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import com.bis.cloudphone.utils.system.Logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DownInterceptedGroup extends FrameLayout {


    public DownInterceptedGroup(@NonNull Context context) {
        super(context);
    }

    public DownInterceptedGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DownInterceptedGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Logger.d("ViewGroup-----dispatchTouchEvent" + ev);
        boolean result = super.dispatchTouchEvent(ev);
        Logger.d("ViewGroup-----dispatchTouchEvent result is" + result);
        return result;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Logger.d("ViewGroup-----onInterceptTouchEvent" + ev);
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Logger.d("ViewGroup-----onTouchEvent" + event);
        boolean result = super.onTouchEvent(event);
        Logger.d("ViewGroup-----onTouchEvent result is" + result);
        return result;
    }
}
