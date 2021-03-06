package com.bis.cloudphone.data.room;

import android.content.Context;

import com.bis.cloudphone.data.room.dao.MainDao;
import com.bis.cloudphone.data.room.tab.DateTable;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {DateTable.class} , version = 1 , exportSchema = false)
public abstract class MainDataBase extends RoomDatabase {

    private static volatile MainDataBase INSTANCE;

    public abstract MainDao mainDao();

    public static MainDataBase getInstance(Context mContext){
        if(INSTANCE == null){
            synchronized (MainDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(mContext.getApplicationContext() ,
                            MainDataBase.class , "Sample.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
