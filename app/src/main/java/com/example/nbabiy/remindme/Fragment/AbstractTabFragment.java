package com.example.nbabiy.remindme.Fragment;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.view.View;

/**
 * Created by Developer on 23.08.2016.
 */
public class AbstractTabFragment extends Fragment {

    private String TITLE;

    protected Context context;
    protected View view;

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }
}
