package com.bis.cloudphone.ui.activity;

import androidx.core.view.ViewCompat;

import android.os.Bundle;

import com.bis.cloudphone.R;
import com.bis.cloudphone.databinding.ActivityDetailBinding;
import com.bis.cloudphone.ui.base.BaseActivity;
import com.bis.cloudphone.ui.base.DataBindingConfig;
import com.bis.cloudphone.ui.viewmodel.MainViewModel;

public class DetailActivity extends BaseActivity<ActivityDetailBinding> {

    private MainViewModel mainViewModel;
    public static final String VIEW_NAME_HEADER_IMAGE = "detail:header:image";
    public static final String VIEW_NAME_HEADER_TITLE = "detail:header:title";

    @Override
    protected void initViewModel() {
        mainViewModel = getActivityViewModel(MainViewModel.class);
    }

    @Override
    protected DataBindingConfig getDataBingingConfig() {
        return new DataBindingConfig(R.layout.activity_detail , mainViewModel);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewCompat.setTransitionName(mBinding.ivDetail, VIEW_NAME_HEADER_IMAGE);
        ViewCompat.setTransitionName(mBinding.tvDetail, VIEW_NAME_HEADER_TITLE);
    }
}