package com.bis.cloudphone.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.bis.cloudphone.utils.system.Logger;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

public class DecoreViewGroup extends LinearLayout {


    public DecoreViewGroup(Context context) {
        super(context);
    }

    public DecoreViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DecoreViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DecoreViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            measureChild(getChildAt(i), widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int childCount = getChildCount();
        int layoutWidth = r-l;
        int left = 0;
        int right = 0;
        int top = 0;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            // 换行：比较right，right如果大于Layout宽度，那么要换行
            right = left + view.getMeasuredWidth();
            if (right > layoutWidth) {
                left = 0;
                right = left + view.getMeasuredWidth();
                top += view.getMeasuredHeight();
            }
            getChildAt(i).layout(left, top, right, top + view.getMeasuredHeight());
            left += view.getWidth();
        }
    }

    /**
     * onInterceptTouchEvent 返回true  自己消费 子类收不到
     *                       返回false 子类消费
     * @param event
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Logger.d("ViewGroup onInterceptTouchEvent ==="+ getDispatchSize(event.getAction()) + super.onInterceptTouchEvent(event));
        return super.onInterceptTouchEvent(event);
    }


    /**
     * dispatchTouchEvent    返回true  自己也消费不到
     *                       返回false 自己可以消费
     *                       返回super.dispatchTouchEvent(event) 默认为false
     * 但是如果返回false ， 就一定要调用super.dispatchTouchEvent(event)方法哦
     * 否则的话onTouchEvent方法还是收不到
     * @param event
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Logger.d("ViewGroup dispatchTouchEvent ======"+ getDispatchSize(event.getAction()) +super.dispatchTouchEvent(event));
        return super.dispatchTouchEvent(event);
    }

    public String getDispatchSize(int patch){
        return patch == 0 ? "点击====" : patch == 1? "抬起====" : patch == 2 ? "移动====" : "其他====";
    }

    /**
     * onTouchEvent    返回true  向上传递，将执行所有的事件
     *                 返回false 自己消费 不向上传递 执行DOWN事件之后不再执行(只有点击事件)
     *                 返回super.dispatchTouchEvent(event) 默认为false , 返回 super.onTouchEvent(event)才能收到点击事件
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Logger.d("ViewGroup onTouchEvent ============"+ getDispatchSize(event.getAction())+ super.onTouchEvent(event));
        return  super.onTouchEvent(event);
    }
}
