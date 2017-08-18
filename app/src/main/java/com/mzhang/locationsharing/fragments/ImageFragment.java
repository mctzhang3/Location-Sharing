package com.mzhang.locationsharing.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mzhang.locationsharing.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFragment extends Fragment {


    EditText mEditText;
    Button mButton;
    LinearLayout mImageView;
    float mScale;
    public ImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_image, container, false);
        mEditText = (EditText) rootView.findViewById(R.id.percentage_text);
        mButton = (Button) rootView.findViewById(R.id.percentage_button);
        mButton.setOnClickListener(mLintener);
        mImageView = (LinearLayout)rootView.findViewById(R.id.img_update);
        mScale = getResources().getDisplayMetrics().density;
//        int dpAsPixels = (int) (200*mScale + 0.5f);
//        mImageView.setPadding(dpAsPixels, 0, 0, 0);

        return rootView;
    }

    View.OnClickListener mLintener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.percentage_button:
                    updateImageView();
                    break;
            }
        }
    };

    public void updateImageView() {
        String percentStr = mEditText.getText().toString();
        int percent = Integer.parseInt(percentStr);
        float per = (float) ((float) percent / 100.0);
        int pixel=getActivity().getWindowManager().getDefaultDisplay().getWidth();
        float validPix = pixel - 37 * mScale;
        int dpAsPixels = (int) (validPix * per + 0.5f);
        mImageView.setPadding(dpAsPixels, 0, 0, 0);
    }
}
