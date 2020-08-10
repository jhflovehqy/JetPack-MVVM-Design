package com.bis.cloudphone.ui.binding;

import android.view.View;

import com.bis.cloudphone.R;
import com.bumptech.glide.Glide;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;

public class ImageLoadBindingAdapter {

    private static long lastClickTime;

    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        if (0 < timeD && timeD < 800) {
            return true;
        }
        lastClickTime = time;
        return false;
    }

    @BindingAdapter("android:onClick")
    public static void setClickListener(View view, final View.OnClickListener listener) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFastDoubleClick()) {
                    return;
                }
                listener.onClick(v);
            }
        });
    }

    @BindingAdapter(value = {"imageUrls"} , requireAll = false)
    public static void loadImageUrl(AppCompatImageView imageView , String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .placeholder(R.drawable.ic_menu_send)//图片加载出来前，显示的图片
                .error(R.drawable.ic_menu_camera)//图片加载失败后，显示的图片
                .into(imageView);
    }

}
