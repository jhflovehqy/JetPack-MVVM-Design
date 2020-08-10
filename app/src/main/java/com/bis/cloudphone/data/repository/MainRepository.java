package com.bis.cloudphone.data.repository;

import android.util.Log;

import com.bis.cloudphone.data.bean.DateBean;
import com.bis.cloudphone.data.repository.impl.IMainData;
import com.bis.cloudphone.http.retrofit.RetrofitHttp;

import androidx.lifecycle.MutableLiveData;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainRepository extends BaseRepository implements IMainData {


    public final static MainRepository MAIN_REPOSITORY = new MainRepository();


    public static MainRepository getInstance(){
        return MAIN_REPOSITORY;
    }



    @Override
    public void loadData(MutableLiveData<DateBean> dateBeanMutableLiveData) {
        RetrofitHttp.getResponse().getDateTime()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(dateBeanMutableLiveData::postValue,
                        throwable -> Log.i("TAG", throwable.toString()));
    }
}
