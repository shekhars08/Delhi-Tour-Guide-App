package com.example.delhitourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private static final int POSITION_ATTRACTION = 0;
    private static final int POSITION_EVENT = 1;
    private static final int POSITION_ACCOMODATION = 2;
    private static final int POSITION_RESTAURANT = 3;
    private static final int NUMBER_OF_POSITIONS = POSITION_RESTAURANT + 1;

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (POSITION_ATTRACTION == position) {
            return new AttractionFragment();
        } else if (POSITION_EVENT == position) {
            return new EventsFragment();
        } else if (POSITION_ACCOMODATION == position) {
            return new AccommodationFragment();
        } else if (POSITION_RESTAURANT == position){
            return new RestaurantsFragment();
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_POSITIONS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (POSITION_ATTRACTION == position) {
            return mContext.getString(R.string.attraction_fragment_title);
        } else if (POSITION_EVENT == position) {
            return mContext.getString(R.string.events_fragment_title);
        } else if (POSITION_ACCOMODATION == position) {
            return mContext.getString(R.string.accommodation_fragment_title);
        } else if (POSITION_RESTAURANT == position){
            return mContext.getString(R.string.restaurants_fragment_title);
        }
        else {
            return null;
        }
    }
}
