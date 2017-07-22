package com.example.ahmad.pms;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by ahmad on 7/22/2017.
 */

public class xmlFragement extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {



        ScrollView scroller = new ScrollView(getActivity());
        TextView text = new TextView(getActivity());
        int padding = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP , 4 ,getActivity().getResources().getDisplayMetrics()
        );
        text.setPadding(padding , padding , padding , padding);
        scroller.addView(text);
        scroller.setBackgroundColor(Color.parseColor("#ffffff"));
        text.setText("Testing");
        text.setTextSize(30);
        text.setPadding(35 , 35, 35, 35);



        return scroller;

    }
}
