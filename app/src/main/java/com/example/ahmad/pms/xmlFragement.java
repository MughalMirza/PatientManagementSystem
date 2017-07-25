package com.example.ahmad.pms;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by ahmad on 7/22/2017.
 */

public class xmlFragement extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //ScrollView scroller = new ScrollView(getActivity());


//        TextView text = new TextView(getActivity());
//        scroller.addView(text);
//
//        scroller.setBackgroundColor(Color.parseColor("#ffffff"));
//        text.setText("Testing");
//
//        text.setTextSize(30);
//
//        text.setTypeface(Typeface.DEFAULT_BOLD);
//
//        text.setTextColor(Color.parseColor("#32CD32"));
//
//        //text.setPadding(35 , 35, 35, 35);
//        text.setGravity(Gravity.CENTER);

///////////////////////////////////////////////////////////////////////////
//         int N = 2; // total number of textviews to add
//
//         TextView[] myTextViews = new TextView[N]; // create an empty array;
//
//        for (int i = 0; i < N; i++) {
//            // create a new textview
//             TextView rowTextView = new TextView(getActivity());
//
//            // set some properties of rowTextView or something
//            rowTextView.setText("This is row #" + i);
//
//            // add the textview to the linearlayout
//            scroller.addView(rowTextView);
//            rowTextView.setPadding(0,N*10,0,0);
//            rowTextView.setId(i + 5);
            // save a reference to the textview for later
//            myTextViews[i] = rowTextView;
//        }
///////////////////////////////////////////////////////////////////////////

//        RelativeLayout relativelayout = new RelativeLayout(getActivity());
//
//        int N=2;
//
//
//
//            Button btn = new Button(getActivity());
//
//            ViewGroup.LayoutParams layoutparams = new RelativeLayout.LayoutParams(
//                    ViewGroup.LayoutParams.MATCH_PARENT,
//                    ViewGroup.LayoutParams.MATCH_PARENT
//            );
//            ViewGroup.LayoutParams LayoutParamsButtons = new RelativeLayout.LayoutParams(
//                    ViewGroup.LayoutParams.WRAP_CONTENT,
//                    ViewGroup.LayoutParams.WRAP_CONTENT
//            );
//            relativelayout.setLayoutParams(layoutparams);
//
//            relativelayout.setBackgroundColor(Color.parseColor("#fa0303"));
//            //LayoutParamsButtons.addRule(RelativeLayout.CENTER_IN_PARENT);
//            btn.setLayoutParams(LayoutParamsButtons);
//            btn.setPadding( 10*N , 10*N,  10*N,  10*N);
//            btn.setText("Button Name" );
//            btn.setBackgroundColor(Color.BLUE);
//
//        for (int i=0; i<N ; i++) {
//            relativelayout.addView(btn);
//        }




        ////////////////////////////////////////////////////////////////////////GOOD PRACTISE///////////////////////////////////////////////////////////


        // RelativeLayout relativeLayout = new RelativeLayout(getActivity());

        LinearLayout layout =  new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);


        layout.setBackgroundColor(Color.parseColor("#ffffff"));

        for (int i = 0; i < 6; i++) {
            LinearLayout row = new LinearLayout(getActivity());
            row.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < 3; j++ ){
                Button btnTag = new Button(getActivity());
                TextView text = new TextView(getActivity());
                btnTag.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                btnTag.setText("Button " + (j + 1 + (i * 3) ));
                text.setText("text " + (j + 1 + (i * 3) ));
                btnTag.setId(j + 1 + (i * 3));
                row.addView(btnTag);
                row.addView(text);
            }

            layout.addView(row);
        }

        //relativeLayout.addView(layout);
        //getActivity().setContentView(relativeLayout);


        return layout;
    }
}
