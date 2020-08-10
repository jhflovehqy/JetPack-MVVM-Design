package com.bis.cloudphone.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * 作者： 江海锋
 * 添加时间： 2020/7/22 11:05
 * 说明： 权限校验
 */
public class PermissionViewModel extends ViewModel {

    private MutableLiveData<Boolean> permissionLiveData;

    //TODO tip 向 ui 层提供的 request LiveData，使用抽象的 LiveData 而不是 MutableLiveData
    // 如此是为了来自数据层的数据，在 ui 层中只读，以避免团队新手不可预期的误用

    public MutableLiveData<Boolean> getPermissionLiveData() {
        if (permissionLiveData == null) {
            permissionLiveData = new MutableLiveData<>();
        }
        return permissionLiveData;
    }

}
