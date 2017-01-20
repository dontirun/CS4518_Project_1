package com.example.arun.cs4518_project1_screen3;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wv = (WebView) findViewById(R.id.web);
        wv.getSettings().setJavaScriptEnabled(true);

        TextView tv = (TextView) findViewById(R.id.description);
        tv.setText("A platform to colloborate on code with version control");


        wv.loadUrl("https://github.com/");


    }

    public void showWeb1(View v)
    {
        TextView tv = (TextView) findViewById(R.id.description);
        tv.setText("A platform to colloborate on code with version control");

        WebView wv = (WebView) findViewById(R.id.web);
        wv.loadUrl("https://github.com/");
    }

    public void showWeb2(View v)
    {
        TextView tv = (TextView) findViewById(R.id.description);
        tv.setText("An online android forum");

        WebView wv = (WebView) findViewById(R.id.web);
        wv.loadUrl("https://www.xda-developers.com/");
    }

    public void showWeb3(View v)
    {
        TextView tv = (TextView) findViewById(R.id.description);
        tv.setText("A website used to ask coding questions and get answers");

        WebView wv = (WebView) findViewById(R.id.web);
        wv.loadUrl("http://stackoverflow.com/");
    }
}
