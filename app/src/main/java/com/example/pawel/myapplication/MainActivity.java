package com.example.pawel.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView napis;
    private TextView napis2;
    private Button przycisk;
    private Button przycisk2;
    private Button przycisk3;
    private EditText one;



    private int n;
    private int i;
    private int n1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        napis = findViewById(R.id.textView);
        napis2 = findViewById(R.id.textView2);
        przycisk = findViewById(R.id.button);
        przycisk2 = findViewById(R.id.button2);
        przycisk3 = findViewById(R.id.button3);
        one = findViewById(R.id.editText);




    }

    public void onClickButton(View view) {
       Random random = new Random();
        n = random.nextInt(10); // 0..9
        try {
            n1 = Integer.parseInt(one.getText().toString());
            if (n1 > n) {
                napis.setText("Ta liczba jest większa od " + n);
            } else if (n1 < n) {
                napis.setText("Ta liczba jest mniejsza od " + n);
            } else {
                napis.setText("Brawo! Wylosowałeś tę samą liczbe :)");
            }
        } catch(NumberFormatException e) {
            napis.setText("Wprowadź prawidłową liczbę");
        }


        i = i + 1;
        napis2.setText("Liczba losowań: " + String.valueOf(i));

        if(n == n1){
            napis.setText("Brawo! Wylosowałeś tę samą liczbe :)");
            napis2.setText("Liczba losowań potrzebna do wylosowania tej samej liczby: " + String.valueOf(i));
            i = 0;
        }


    }

    public void reset(View view) {
        i = 0;
        napis2.setText("Liczba losowań: " + String.valueOf(i));
        napis.setText("");
    }

    public void Back(View view) {
        finish();
    }

}
