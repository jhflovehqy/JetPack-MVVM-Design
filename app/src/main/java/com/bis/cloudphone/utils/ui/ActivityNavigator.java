package com.bis.cloudphone.utils.ui;

import android.app.Activity;

public  class ActivityNavigator {


    private Activity activity;

    public ActivityNavigator bind(Activity activity){
        this.activity = activity;
        return new ActivityNavigator();
    }

    public ActivityNavigator addPu(){
        return this;
    }


}
