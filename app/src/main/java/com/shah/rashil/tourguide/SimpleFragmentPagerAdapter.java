package com.shah.rashil.tourguide;

/**
 * Created by rashil on 18/8/17.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext =  context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragments();
        } else if (position == 1){
            return new RestaurantsFragments();
        } else if (position == 2){
            return new StreetFoodFragment();
        } else {
            return new ShoppingFragments();
        }
    }



    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.category_street);
        } else {
            return mContext.getString(R.string.category_shopping);
        }
    }
}
