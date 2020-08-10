package com.bis.cloudphone.data.room.source.dao;

import com.bis.cloudphone.data.room.tab.DateTable;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public interface MainDataSource {


    /**
     * @return
     */
    Flowable<DateTable> getDateData();


    /**
     * @param dateBean
     */
    Completable insertDate(DateTable dateBean);


    /**
     * @return
     */
    void deleteAllDate();

}
