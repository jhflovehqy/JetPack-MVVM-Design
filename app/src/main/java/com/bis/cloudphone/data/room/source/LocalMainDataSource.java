package com.bis.cloudphone.data.room.source;

import com.bis.cloudphone.data.room.dao.MainDao;
import com.bis.cloudphone.data.room.source.dao.MainDataSource;
import com.bis.cloudphone.data.room.tab.DateTable;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public class LocalMainDataSource implements MainDataSource {


    private final MainDao mainDao;


    public LocalMainDataSource(MainDao mainDao) {
        this.mainDao = mainDao;
    }

    @Override
    public Flowable<DateTable> getDateData() {
        return mainDao.getDateData();
    }

    @Override
    public Completable insertDate(DateTable dateBean) {
        return mainDao.insertDate(dateBean);
    }

    @Override
    public void deleteAllDate() {
        mainDao.deleteAllDate();
    }
}
