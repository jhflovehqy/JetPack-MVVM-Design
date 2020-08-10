package com.bis.cloudphone.ui.viewmodel;

import com.bis.cloudphone.data.bean.DateBean;
import com.bis.cloudphone.data.repository.MainRepository;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DateViewModel extends ViewModel {

    public MutableLiveData<DateBean> dateBeanMutableLiveData = new MutableLiveData<>();


    public void loadDateShowData() {
        MainRepository.getInstance().loadData(dateBeanMutableLiveData);
    }
}

