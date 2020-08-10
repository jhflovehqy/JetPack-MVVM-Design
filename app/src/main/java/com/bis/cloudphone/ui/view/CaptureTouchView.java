package com.bis.cloudphone.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.bis.cloudphone.utils.system.Logger;

import androidx.annotation.Nullable;

public class CaptureTouchView extends View {


    public CaptureTouchView(Context context) {
        super(context);
    }

    public CaptureTouchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CaptureTouchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Logger.d("View-----dispatchTouchEvent" + ev);
        boolean isTouch = super.dispatchTouchEvent(ev);
        Logger.d("View-----dispatchTouchEvent result is ：" + isTouch);
        return isTouch;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = super.onTouchEvent(event);
        Logger.d("View-----onTouchEvent result is ：" + result);
        return true;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(200 , 200);
    }
}
