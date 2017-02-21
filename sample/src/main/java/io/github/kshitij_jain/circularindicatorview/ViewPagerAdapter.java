package io.github.kshitij_jain.circularindicatorview;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by flash on 21/2/17.
 */

public class ViewPagerAdapter extends PagerAdapter{

    private Integer mViewsCount;

    public ViewPagerAdapter(int viewsCount) {
        mViewsCount = viewsCount;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.view_pager, container, false);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return mViewsCount;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }

}
