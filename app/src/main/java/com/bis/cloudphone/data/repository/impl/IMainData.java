package com.bis.cloudphone.data.repository.impl;

import com.bis.cloudphone.data.bean.DateBean;

import androidx.lifecycle.MutableLiveData;

public interface IMainData {
    void loadData(MutableLiveData<DateBean> dateBeanMutableLiveData);
}
