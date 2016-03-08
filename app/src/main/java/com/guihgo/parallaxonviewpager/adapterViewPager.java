package com.guihgo.parallaxonviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class adapterViewPager extends FragmentStatePagerAdapter {

	public adapterViewPager(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {

		return new fragmentPage();
	}

	@Override
	public int getCount() {
		return 5; //the number of paggers on ViewPager -_-
	}
}

