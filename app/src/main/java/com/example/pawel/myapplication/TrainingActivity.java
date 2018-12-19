package com.example.pawel.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class TrainingActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView description;
    private ImageView imagedesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Podstawowe ćwiczenia");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        spinner = findViewById(R.id.spinner);
        description = findViewById(R.id.description);
        imagedesc = findViewById(R.id.imagedesc);

        String[] table = new String[]{"Pompki klasyczne", "Pompki na poręczach (dipsy)", "Podciąganie na drążku", "Przysiady", "Unoszenie nóg", "Mostek", "Muscle Up"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, table);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        imagedesc.setImageResource(R.drawable.push_ups);
                        description.setText(R.string.description_pompka);
                        break;
                    case 1:
                        imagedesc.setImageResource(R.drawable.dipy);
                        description.setText(R.string.description_dipy);
                        break;
                    default:
                        description.setText(R.string.description_default);
                        break;
                    case 2:
                        imagedesc.setImageResource(R.drawable.podciaganie);
                        description.setText(R.string.description_podciaganie);
                        break;
                    case 3:
                        imagedesc.setImageResource(R.drawable.przysiady);
                        description.setText(R.string.description_przysiady);
                        break;
                    case 4:
                        imagedesc.setImageResource(R.drawable.nogi);
                        description.setText(R.string.description_nogi);
                        break;
                    case 5:
                        imagedesc.setImageResource(R.drawable.mostek);
                        description.setText(R.string.description_mostek);
                        break;
                    case 6:
                        imagedesc.setImageResource(R.drawable.muscle);
                        description.setText(R.string.description_muscle);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
