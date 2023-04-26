package com.bis.cloudphone.ui.binding;

import com.google.android.material.tabs.TabLayout;

import androidx.databinding.BindingAdapter;

/**
 * Create by KunMinX at 2020/3/13
 */
public class TabPageBindingAdapter {

//    @BindingAdapter(value = {"initTabAndPage"}, requireAll = false)
//    public static void initTabAndPage(TabLayout tabLayout, boolean initTabAndPage) {
//        int count = tabLayout.getTabCount();
//        String[] title = new String[count];
//        for (int i = 0; i < count; i++) {
//            TabLayout.Tab tab = tabLayout.getTabAt(i);
//            if (tab != null && tab.getText() != null) {
//                title[i] = tab.getText().toString();
//            }
//        }
//        ViewPager viewPager = (tabLayout.getRootView()).findViewById(R.id.view_pager);
//        if (viewPager != null) {
//            viewPager.setAdapter(new CommonViewPagerAdapter(count, false, title));
//            tabLayout.setupWithViewPager(viewPager);
//        }
//    }

    @BindingAdapter(value = {"tabSelectedListener"}, requireAll = false)
    public static void tabSelectedListener(TabLayout tabLayout, TabLayout.OnTabSelectedListener listener) {
        tabLayout.addOnTabSelectedListener(listener);
    }

}