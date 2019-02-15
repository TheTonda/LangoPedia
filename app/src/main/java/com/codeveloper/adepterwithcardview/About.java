package com.codeveloper.adepterwithcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        setTitle("About");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
}
