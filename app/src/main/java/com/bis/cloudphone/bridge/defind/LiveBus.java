package com.bis.cloudphone.bridge.defind;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 作者： 江海锋
 * 添加时间： 2020/7/24 10:54
 * 说明： 基于LiveData的事件总线通讯
 */
public class LiveBus {

    public static final LiveBus liveBus = new LiveBus();

    public static LiveBus getInstance(){
        return liveBus;
    }

    private ConcurrentHashMap<String , StickyLiveData> stickyLiveDataMap = new ConcurrentHashMap<>();



    public <T> StickyLiveData<T> with(String event){
        StickyLiveData<T> stickyLiveData = stickyLiveDataMap.get(event);
        if(stickyLiveData == null){
             stickyLiveData = new StickyLiveData<>();
             stickyLiveDataMap.put(event , stickyLiveData);
        }
        return stickyLiveData;
    }


    public void removeObserver(String event){
        stickyLiveDataMap.remove(event);
    }

    public int size(){
        return stickyLiveDataMap.size();
    }


    public boolean hasObservers() {
        return stickyLiveDataMap.size() > 0;
    }
}
