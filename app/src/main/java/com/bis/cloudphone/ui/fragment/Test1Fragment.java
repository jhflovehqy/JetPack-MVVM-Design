package com.bis.cloudphone.ui.fragment;

import com.bis.cloudphone.R;
import com.bis.cloudphone.databinding.FragmentTest1Binding;
import com.bis.cloudphone.ui.base.BaseFragment;
import com.bis.cloudphone.ui.base.DataBindingConfig;

public class Test1Fragment extends BaseFragment<FragmentTest1Binding> {
    @Override
    protected void initViewModel() {

    }

    @Override
    protected DataBindingConfig getDataBindingConfig() {
        return new DataBindingConfig(R.layout.fragment_test1);
    }

    @Override
    protected void loadInitData() {
        super.loadInitData();
        gotoTest2();
    }

    public void gotoTest2(){
        mBinding.btn1.setOnClickListener(view -> nav().navigate(R.id.action_test1Fragment_to_test2Fragment));
    }
}
