package com.mecaylinmia.finalproject;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;

/**
 * Created by Admin on 2017-02-21.
 */

public class WhatNotToDo extends Fragment {
    TextView tv;
    private Scroller computeScrollOffset;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.image);
        tv = (TextView) rootView.findViewById(R.id.main_instruction);

        TextView tvTitle = (TextView) rootView.findViewById(R.id.title);
        tvTitle.setText(R.string.title_not_to_do);
        Resources resources = getContext().getResources();
        imageView.setImageDrawable(resources.getDrawable(R.drawable.not_to_do));

        tv.setTextSize(22);
        tv.setBackgroundResource(R.color.colorNotToDo);
        tv.setScroller(computeScrollOffset);
        tv.setText(resources.getText(R.string.not_to_do));


        return rootView;
    }

}
