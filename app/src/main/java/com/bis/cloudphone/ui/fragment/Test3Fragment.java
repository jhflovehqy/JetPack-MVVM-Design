package com.bis.cloudphone.ui.fragment;

import com.bis.cloudphone.R;
import com.bis.cloudphone.databinding.FragmentTest1Binding;
import com.bis.cloudphone.databinding.FragmentTest3Binding;
import com.bis.cloudphone.ui.base.BaseFragment;
import com.bis.cloudphone.ui.base.DataBindingConfig;

public class Test3Fragment extends BaseFragment<FragmentTest3Binding> {
    @Override
    protected void initViewModel() {

    }

    @Override
    protected DataBindingConfig getDataBindingConfig() {
        return new DataBindingConfig(R.layout.fragment_test3);
    }
}
