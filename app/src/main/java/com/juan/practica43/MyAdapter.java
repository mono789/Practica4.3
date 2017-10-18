package com.juan.practica43;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import static com.juan.practica43.SwipeTabsFragment.int_items;
/**
 * Created by juan on 16/10/17.
 */

public class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new AlienFragment();
            case 1:
                return new AlienFragment1();
            case 2:
                return new AlienFragment2();
        }
        return null;
    }

    @Override
    public int getCount() {

        return int_items;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Alien1";
            case 1:
                return "Alien2";
            case 2:
                return "Alien3";
        }
        return null;
    }
}
