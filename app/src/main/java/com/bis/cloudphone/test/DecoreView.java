package com.bis.cloudphone.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.bis.cloudphone.utils.system.Logger;

import androidx.annotation.Nullable;

public class DecoreView extends View {


    public DecoreView(Context context) {
        super(context);
    }

    public DecoreView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DecoreView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DecoreView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    public String getDispatchSize(int patch){
        return patch == 0 ? "点击====" : patch == 1? "抬起====" : patch == 2 ? "移动====" : "其他====";
    }

    /**
     * 控制自己
     * dispatchTouchEvent    返回true  自己也消费不到
     *                       返回false 自己可以消费
     *                       super.dispatchTouchEvent(event) 默认false 自己可以消费
     * 但是如果返回false ， 就一定要调用super.dispatchTouchEvent(event)方法哦
     * 否则的话onTouchEvent方法还是收不到
     * 如果返回true就不用啦，因为已经被强制拦截啦
     * @param event
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Logger.d("View dispatchTouchEvent ==========="+ getDispatchSize(event.getAction()) + super.dispatchTouchEvent(event));
        return super.dispatchTouchEvent(event);
    }

    /**
     * onTouchEvent    返回true  向上传递，将执行所有的事件 ,但是不会执行onclick(）方法
     *                 返回false 自己消费 不向上传递 不会执行onclick
     *                 返回super.dispatchTouchEvent(event) 默认为false ， 会执行onClick
     * 子view的onTouchEvent没有返回True。则最后还是由ViewGroup去消费此事件
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Logger.d("View onTouchEvent =================" + getDispatchSize(event.getAction()) + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
