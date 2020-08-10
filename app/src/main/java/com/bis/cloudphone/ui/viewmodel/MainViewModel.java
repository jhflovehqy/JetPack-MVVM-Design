package com.bis.cloudphone.ui.viewmodel;

import com.bis.cloudphone.data.bean.DateBean;
import com.bis.cloudphone.data.repository.MainRepository;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<DateBean> dateShowData = new MutableLiveData<>();


    public MutableLiveData<DateBean> getDateShowData() {
        return dateShowData;
    }

    public void loadDateShowData() {
        MainRepository.getInstance().loadData(getDateShowData());
    }


}
