package com.example.pawel.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class KalistenikaActivity extends AppCompatActivity {

    private ImageView foto1;
    private ImageView foto2;
    private ImageView foto3;
    private ImageView foto4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalistenika);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Kalistenika - aktywności");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        foto1 = findViewById(R.id.imageView3);
        foto2 = findViewById(R.id.imageView5);
        foto3 = findViewById(R.id.imageView6);
        foto4 = findViewById(R.id.imageView7);
    }

    public void OpenTraining(View view) {
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);
    }

    public void OpenCalories(View view) {
        Intent intent = new Intent(this, CaloriesActivity.class);
        startActivity(intent);
    }

    public void OpenNotebook(View view) {
        Intent intent = new Intent(this, NotebookActivity.class);
        startActivity(intent);

    }

    public void OpenStreet(View view) {
        Intent intent = new Intent(this, ProgressionActivity.class);
        startActivity(intent);

    }

}