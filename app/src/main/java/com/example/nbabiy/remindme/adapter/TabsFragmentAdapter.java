package com.example.nbabiy.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nbabiy.remindme.Fragment.AbstractTabFragment;
import com.example.nbabiy.remindme.Fragment.BirthdaysFragment;
import com.example.nbabiy.remindme.Fragment.HistoryFragment;
import com.example.nbabiy.remindme.Fragment.IdeasFragment;
import com.example.nbabiy.remindme.Fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Developer on 20.08.2016.
 */
public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;


    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTITLE();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
