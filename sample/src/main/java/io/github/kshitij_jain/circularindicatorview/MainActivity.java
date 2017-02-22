package io.github.kshitij_jain.circularindicatorview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import io.github.kshitij_jain.indicatorview.IndicatorView;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private IndicatorView mIndicatorView;
    private ViewPagerAdapter mViewPagerAdapter;
    private AppCompatButton mButtonSkip;
    private AppCompatButton mButtonNext;
    private Integer viewsCount = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        mIndicatorView.setPageIndicators(viewsCount);

        setupViewPager();

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int current = getItem(+1);
                if (current < viewsCount) {
                    mViewPager.setCurrentItem(current);
                }
            }
        });
    }

    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mButtonSkip = (AppCompatButton) findViewById(R.id.button_skip);
        mButtonNext = (AppCompatButton) findViewById(R.id.button_next);
        mIndicatorView = (IndicatorView) findViewById(R.id.circle_indicator_view);
    }

    private void setupViewPager() {
        mViewPagerAdapter = new ViewPagerAdapter(viewsCount);
        mViewPager.setAdapter(mViewPagerAdapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                mIndicatorView.setCurrentPage(position);

                if (position == viewsCount - 1) {
                    mButtonNext.setText("Start");
                    mButtonSkip.setVisibility(View.GONE);
                } else {
                    mButtonNext.setText("Next");
                    mButtonSkip.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private int getItem(int i) {
        return mViewPager.getCurrentItem() + i;
    }

}
