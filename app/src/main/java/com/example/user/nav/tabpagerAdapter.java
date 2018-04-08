package com.example.user.nav;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class tabpagerAdapter extends FragmentStatePagerAdapter{
    String tabarray[] = new String[]{"One", "Two", "Three"};
    Integer tabnumber =3;

    public tabpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                OneTabbedFragment one = new OneTabbedFragment();
                return one;
            case 1:
                TwoTabbedFragment two = new TwoTabbedFragment();
                return two;
            case 2:
                ThreeFragment three = new ThreeFragment();
                return three;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return tabarray[position];
    }
}
