package com.bis.cloudphone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.bis.cloudphone.data.bean.DateBean;
import com.bis.cloudphone.data.repository.MainRepository;
import com.bis.cloudphone.data.room.source.dao.MainDataSource;
import com.bis.cloudphone.data.room.tab.DateTable;
import com.bis.cloudphone.databinding.ActivityMainBinding;
import com.bis.cloudphone.observer.MainLifecycle;
import com.bis.cloudphone.observer.PermissionLifecycle;
import com.bis.cloudphone.ui.base.AutoWired;
import com.bis.cloudphone.ui.base.BaseActivity;
import com.bis.cloudphone.ui.base.DataBindingConfig;
import com.bis.cloudphone.ui.viewmodel.DateViewModel;
import com.bis.cloudphone.ui.viewmodel.MainViewModel;
import com.bis.cloudphone.ui.viewmodel.PermissionViewModel;
import com.bis.cloudphone.utils.system.Logger;
import com.bis.cloudphone.utils.ui.ToastUtils;

import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

public class MainActivity extends BaseActivity<ActivityMainBinding> {


    private MainViewModel mainViewModel;
    private DateViewModel dateViewModel;
    private PermissionViewModel permissionViewModel;

    @AutoWired
    DateBean dateBean;
    @AutoWired
    MainRepository mainRepository;
    MainDataSource mainDataSource;



    @Override
    protected void initViewModel() {
        mainViewModel = getActivityViewModel(MainViewModel.class);
        dateViewModel = getActivityViewModel(DateViewModel.class);
        permissionViewModel = getActivityViewModel(PermissionViewModel.class);
    }

    @Override
    protected DataBindingConfig getDataBingingConfig() {
        return new DataBindingConfig(R.layout.activity_main, mainViewModel)
                .addBingingParam(BR.click, new ClickProxy())
                .addBingingParam(BR.date, dateViewModel);
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //监听
        getLifecycle().addObserver(MainLifecycle.getInstance(mainViewModel));
        getLifecycle().addObserver(PermissionLifecycle.getInstance(permissionViewModel));
        getLifecycle().addObserver(new MyLifycycle());

        Observer observer = (Observer<Integer>) o -> Logger.d("当前" + o.toString());



        MutableLiveData<Integer> liveData1 = new MutableLiveData<>();
        MutableLiveData<Integer> liveData2 = new MutableLiveData<>();
        MediatorLiveData<Integer> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(liveData1 , observer);
        mediatorLiveData.addSource(liveData2 , observer);

        liveData1.setValue(1);

        com.bis.cloudphone.design.abstractfactory.AbstractFactory.createFactory();



        permissionViewModel.getPermissionLiveData().setValue(true);

        permissionViewModel.getPermissionLiveData().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                ToastUtils.show("有变化啦!" + aBoolean);
            }
        });

        mainViewModel.getDateShowData().observe(this, new Observer<DateBean>() {
            @SuppressLint("CheckResult")
            @Override
            public void onChanged(DateBean dateBeans) {
                DateTable dateTable = new DateTable();
                dateTable.setApi("1111");
                dateTable.setV("2222");



//                DateInjection.createDataBase(MainActivity.this, dateTable);

                mainDataSource.insertDate(dateTable)
                        .subscribeOn(io.reactivex.schedulers.Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(() -> Log.d("JHF", "成功"), new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                Log.d("JHF", throwable.toString());
                            }
                        });

                mainDataSource.getDateData()
                        .subscribeOn(io.reactivex.schedulers.Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<DateTable>() {
                            @Override
                            public void accept(DateTable dateTable) throws Exception {
                                Log.d("JHF", dateTable.toString());
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                Log.d("JHF", throwable.toString());
                            }
                        });


                dateBean.setApi("我要开始更新啦！");
                showLongToast("我要开始更新数据啦！");
            }
        });


        LuaState luaState = LuaStateFactory.newLuaState();
        luaState.openLibs();
        luaState.LdoFile("/sdcard/aa/test.lua");//对应脚本路径
    }

    @SuppressLint("RestrictedApi")
    class MyLifycycle implements LifecycleEventObserver {

        @Override
        public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
            Logger.d("MyLifycycle-->"  + source.getLifecycle().getCurrentState().toString());
        }
    }




    public class ClickProxy {

        public void clickTest() {
            ToastUtils.show("View被点击了!");
        }
        public void clickGroupTest() {
            ToastUtils.show("ViewGroup被点击了!");
        }

    }


}
