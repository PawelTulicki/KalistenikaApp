package com.example.pawel.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class ProgressionActivity extends AppCompatActivity {
    private Spinner spinner2;
    private ImageView imagedesc1;
    private ImageView imagedesc2;
    private ImageView imagedesc3;
    private ImageView imagedesc4;
    private ImageView imagedesc5;
    private ImageView imagedesc6;
    private TextView description_progression;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progression);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Kalistenika - progresja");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        spinner2 = findViewById(R.id.spinner2);
        imagedesc1 = findViewById(R.id.imagedesc1);
        description_progression = findViewById(R.id.description_progression);

        String[] table = new String[]{"Front Lever", "Back Lever", "Planche", "Flaga", "Dragon Flag", "Muscle Up"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, table);

        spinner2.setAdapter(adapter);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        imagedesc1.setImageResource(R.drawable.frontlever);
                        description_progression.setText(R.string.description_frontlever);
                        break;
                    case 1:
                        imagedesc1.setImageResource(R.drawable.backlever);
                        description_progression.setText(R.string.description_backlever);
                        break;
                    case 2:
                        imagedesc1.setImageResource(R.drawable.planche);
                        description_progression.setText(R.string.description_planche);
                        break;
                    case 3:
                        imagedesc1.setImageResource(R.drawable.flaga);
                        description_progression.setText(R.string.description_flaga);
                        break;
                    case 4:
                        imagedesc1.setImageResource(R.drawable.dragonflag);
                        description_progression.setText(R.string.description_dragonflag);
                        break;
                    case 5:
                        imagedesc1.setImageResource(R.drawable.muscleup);
                        description_progression.setText(R.string.description_muscle);
                        break;
                    default:
                        description_progression.setText(R.string.description_default);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onClickProgression(View view) {
        Intent intent = new Intent(this, FLProgressionActivity.class);
        startActivity(intent);

    }


}
