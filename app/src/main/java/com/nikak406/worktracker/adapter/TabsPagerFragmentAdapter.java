package com.nikak406.worktracker.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.nikak406.worktracker.R;
import com.nikak406.worktracker.fragments.PeriodFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;


    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Day", "Week", "Month"
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return PeriodFragment.getInstance("Day");
            case 1: return PeriodFragment.getInstance("Week");
            case 2: return PeriodFragment.getInstance("Month");
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
