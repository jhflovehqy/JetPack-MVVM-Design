package com.bis.cloudphone.data.room;

import android.annotation.SuppressLint;
import android.content.Context;

import com.bis.cloudphone.data.room.source.LocalMainDataSource;
import com.bis.cloudphone.data.room.source.dao.MainDataSource;
import com.bis.cloudphone.data.room.tab.DateTable;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class DateInjection {


    @SuppressLint("CheckResult")
    public static void createDataBase(Context context, DateTable dateTable) {
        MainDataBase.getInstance(context).mainDao().insertDate(dateTable)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread());
    }


    public static MainDataSource provideUserDataSource(Context context) {
        MainDataBase database = MainDataBase.getInstance(context);
        return new LocalMainDataSource(database.mainDao());
    }


}
