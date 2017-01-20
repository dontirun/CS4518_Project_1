package com.example.arun.cs4518_project1_screen2;

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import static android.R.attr.layout_gravity;
import static android.R.attr.right;
import static com.example.arun.cs4518_project1_screen2.R.drawable.arun_photo;
import static com.example.arun.cs4518_project1_screen2.R.drawable.priya_photo;

/**
 * Created by Arun on 1/19/2017.
 */

public class BoxAdapter extends ArrayAdapter<Box> {
    public BoxAdapter(Context context, ArrayList<Box> boxes){
        super(context, 0, boxes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Get the data item for this position
        Box box = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.box_pictures, parent, false);
        }

        ImageView image = (ImageView) convertView.findViewById(R.id.image1);
        if(box.show2 == 1){
            image.setImageResource(priya_photo);
            FrameLayout.LayoutParams layoutParams=new FrameLayout.LayoutParams(parent.getWidth()/2, parent.getHeight()/4);
            layoutParams.gravity= Gravity.RIGHT;
            image.setLayoutParams(layoutParams);
        }
        else{
            image.setImageResource(arun_photo);
            FrameLayout.LayoutParams layoutParams=new FrameLayout.LayoutParams(parent.getWidth()/2, parent.getHeight()/4);
            layoutParams.gravity= Gravity.LEFT;
            image.setLayoutParams(layoutParams);

        }
        // Return the completed view to render on screen
        return convertView;
    }
}
