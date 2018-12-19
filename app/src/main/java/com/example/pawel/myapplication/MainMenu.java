package com.example.pawel.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainMenu extends AppCompatActivity {
        private Button przycisk4;
        private Button przycisk5;
        private Button przycisk6;
        private Button przycisk7;
        private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        przycisk4 = findViewById(R.id.button4);
        przycisk5 = findViewById(R.id.button5);
        przycisk6 = findViewById(R.id.button6);
        przycisk7 = findViewById(R.id.button7);
        text = findViewById(R.id.textView3);
    }

    public void OpenRandom(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void OpenKalistenika(View view) {
        Intent intent1 = new Intent(this, KalistenikaActivity.class);
        startActivity(intent1);
    }

    public void OpenGallery(View view) {
        Intent intent2 = new Intent(this, GalleryActivity.class);
        startActivity(intent2);
    }

}
