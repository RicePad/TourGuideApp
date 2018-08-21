package com.udacity.jonathan.tourorlandoapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;


public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ThemeParksFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new HotelFragment();
        } else {
            return new NightClubFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.theme_park_category);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurant_category);
        } else if (position == 2) {
            return mContext.getString(R.string.hotel_category);
        } else {
            return mContext.getString(R.string.night_clubs_category);
        }
    }
}


