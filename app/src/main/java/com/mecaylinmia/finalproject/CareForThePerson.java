package com.mecaylinmia.finalproject;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 2017-02-21.
 */

public class CareForThePerson extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.image);
        TextView tv = (TextView) rootView.findViewById(R.id.main_instruction);

        TextView tvTitle = (TextView) rootView.findViewById(R.id.title);
        tvTitle.setText(R.string.title_care);
        Resources resources = getContext().getResources();
        imageView.setImageDrawable(resources.getDrawable(R.drawable.care_for_person));

        tv.setTextSize(22);
        tv.setBackgroundResource(R.color.colorcare);
        tv.setText(resources.getText(R.string.care_for_person));


        return rootView;
    }
}
