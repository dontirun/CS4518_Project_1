package com.example.arun.cs4518_project1_screen2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populate();

    }

    public void populate(){
        ArrayList<Box> BA = new ArrayList<Box>();
        BoxAdapter adapter = new BoxAdapter(this, BA);
        ListView listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(adapter);
        listView.setAdapter(adapter);

        Box box1 = new Box(1,0);
        Box box2 = new Box(0,1);
        Box box3 = new Box(1,0);
        Box box4 = new Box(0,1);
        Box box5 = new Box(1,0);
        Box box6 = new Box(0,1);
        Box box7 = new Box(1,0);
        Box box8 = new Box(0,1);
        Box box9 = new Box(1,0);
        Box box10 = new Box(0,1);
        Box box11 = new Box(1,0);
        Box box12 = new Box(0,1);
        adapter.add(box1);
        adapter.add(box2);
        adapter.add(box3);
        adapter.add(box4);
        adapter.add(box5);
        adapter.add(box6);
        adapter.add(box7);
        adapter.add(box8);
        adapter.add(box9);
        adapter.add(box10);
        adapter.add(box11);
        adapter.add(box12);
    }

}
