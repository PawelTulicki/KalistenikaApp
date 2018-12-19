package com.example.pawel.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FLProgressionActivity  extends AppCompatActivity {

    private TextView textView9;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flprogression);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Progresja");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }




    }
}
