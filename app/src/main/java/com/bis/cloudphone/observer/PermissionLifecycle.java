package com.bis.cloudphone.observer;

import android.Manifest;

import com.bis.cloudphone.MainActivity;
import com.bis.cloudphone.ui.viewmodel.MainViewModel;
import com.bis.cloudphone.ui.viewmodel.PermissionViewModel;
import com.bis.cloudphone.utils.ui.ToastUtils;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/**
 * @author Jianghaifeng
 * 权限校验
 */
public class PermissionLifecycle implements DefaultLifecycleObserver {

    public static PermissionLifecycle PERMISSION_LIFYCYCLE;
    PermissionViewModel permissionViewModel;
    public  String[] permissions = {
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAPTURE_AUDIO_OUTPUT,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.MOUNT_FORMAT_FILESYSTEMS,
            Manifest.permission.SYSTEM_ALERT_WINDOW,
            Manifest.permission.RECORD_AUDIO
    };

    public PermissionLifecycle(PermissionViewModel mainViewModel) {
        this.permissionViewModel = mainViewModel;
    }

    public static PermissionLifecycle getInstance(PermissionViewModel permissionViewModels){
        if(PERMISSION_LIFYCYCLE == null){
            synchronized (PermissionViewModel.class){
                if(PERMISSION_LIFYCYCLE == null){
                    return new PermissionLifecycle(permissionViewModels);
                }
            }
        }
        return PERMISSION_LIFYCYCLE;
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        permissionViewModel.getPermissionLiveData().observe(owner, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                ToastUtils.show("收到消息啦哈哈哈");
            }
        });

    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {

    }


    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {

    }

}
