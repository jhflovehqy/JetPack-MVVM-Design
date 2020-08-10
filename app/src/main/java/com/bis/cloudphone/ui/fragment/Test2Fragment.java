package com.bis.cloudphone.ui.fragment;

import com.bis.cloudphone.R;
import com.bis.cloudphone.databinding.FragmentTest1Binding;
import com.bis.cloudphone.databinding.FragmentTest2Binding;
import com.bis.cloudphone.ui.base.BaseFragment;
import com.bis.cloudphone.ui.base.DataBindingConfig;

public class Test2Fragment extends BaseFragment<FragmentTest2Binding> {
    @Override
    protected void initViewModel() {

    }

    @Override
    protected DataBindingConfig getDataBindingConfig() {
        return new DataBindingConfig(R.layout.fragment_test2);
    }

    @Override
    protected void loadInitData() {
        super.loadInitData();

    }
}
