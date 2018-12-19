package com.example.pawel.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class CaloriesActivity extends AppCompatActivity {

    private EditText text;
    private EditText text0;
    private EditText text1;
    private EditText text2;
    private EditText text3;
    private EditText text4;
    private EditText text5;
    private EditText text6;
    private EditText text7;
    private EditText text8;
    private CheckBox pop;
    private CheckBox pop2;
    private CheckBox pop3;
    private CheckBox pop4;
    private CheckBox pop5;
    private Button oblicz;
    private TextView wypisz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Kalkulator kalorii");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        pop = findViewById(R.id.pop);
        pop2 = findViewById(R.id.pop2);
        pop3 = findViewById(R.id.pop3);
        pop4 = findViewById(R.id.pop4);
        pop5 = findViewById(R.id.pop5);
        text = findViewById(R.id.text);
        text0 = findViewById(R.id.text0);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        text8 = findViewById(R.id.text8);

        oblicz = findViewById(R.id.oblicz);
        wypisz = findViewById(R.id.wypisz);


        pop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    text.setVisibility(View.VISIBLE);
                    text0.setVisibility(View.VISIBLE);
                } else {
                    text.setVisibility(View.GONE);
                    text0.setVisibility(View.GONE);
                }
            }
        });

        pop2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    text1.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                } else {
                    text1.setVisibility(View.GONE);
                    text2.setVisibility(View.GONE);
                }
            }
        });


        pop3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    text3.setVisibility(View.VISIBLE);
                    text4.setVisibility(View.VISIBLE);
                } else {
                    text3.setVisibility(View.GONE);
                    text4.setVisibility(View.GONE);
                }
            }
        });

        pop4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    text5.setVisibility(View.VISIBLE);
                    text6.setVisibility(View.VISIBLE);
                } else {
                    text5.setVisibility(View.GONE);
                    text6.setVisibility(View.GONE);
                }
            }
        });

        pop5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    text7.setVisibility(View.VISIBLE);
                    text8.setVisibility(View.VISIBLE);
                } else {
                    text7.setVisibility(View.GONE);
                    text8.setVisibility(View.GONE);
                }
            }
        });

        oblicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int policz1 = 0;
                int policz2 = 0;
                int policz3 = 0;
                int policz4 = 0;
                int policz5 = 0;

                if (pop.isChecked()) {
                    String ed1 = text.getText().toString();
                    String ed2 = text0.getText().toString();

                    try {
                        int n1 = Integer.parseInt(ed1);
                        int n2 = 1;
                        if (ed2.length() > 0) {
                            n2 = Integer.parseInt(ed2);
                        }
                        policz1 = n1 * n2 * 5;

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + policz1));

                }

                if (pop2.isChecked()) {
                    String ed3 = text1.getText().toString();
                    String ed4 = text2.getText().toString();

                    try {
                        int n3 = Integer.parseInt(ed3);
                        int n4 = 1;
                        if (ed4.length() > 0) {
                            n4 = Integer.parseInt(ed4);
                        }
                        policz2 = n3 * n4 * 2;

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + policz2));

                }

                if (pop3.isChecked()) {
                    String ed5 = text3.getText().toString();
                    String ed6 = text4.getText().toString();

                    try {
                        int n5 = Integer.parseInt(ed5);
                        int n6 = 1;
                        if (ed6.length() > 0) {
                            n6 = Integer.parseInt(ed6);
                        }
                        policz3 = n5 * n6 * 1;

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + policz3));

                }

                if (pop4.isChecked()) {
                    String ed7 = text5.getText().toString();
                    String ed8 = text6.getText().toString();

                    try {
                        int n7 = Integer.parseInt(ed7);
                        int n8 = 1;
                        if (ed8.length() > 0) {
                            n8 = Integer.parseInt(ed8);
                        }
                        policz4 = n7 * n8 * 1;

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + policz4));

                }

                if (pop5.isChecked()) {
                    String ed9 = text7.getText().toString();
                    String ed10 = text8.getText().toString();

                    try {
                        int n9 = Integer.parseInt(ed9);
                        int n10 = 1;
                        if (ed10.length() > 0) {
                            n10 = Integer.parseInt(ed10);
                        }
                        policz5 = n9 * n10 * 1;

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + policz5));

                }

                if (pop.isChecked()&&pop2.isChecked()) {
                    int wszystko = policz1 + policz2;
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + wszystko));
                }

                if (pop.isChecked()&&pop2.isChecked()&&pop3.isChecked()) {
                    int wszystko = policz1 + policz2 + policz3;
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + wszystko));
                }

                if (pop.isChecked()&&pop2.isChecked()&&pop3.isChecked()&&pop4.isChecked()) {
                    int wszystko = policz1 + policz2 + policz3 + policz4;
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + wszystko));
                }

                if (pop.isChecked()&&pop2.isChecked()&&pop3.isChecked()&&pop4.isChecked()&&pop5.isChecked()) {
                    int wszystko = policz1 + policz2 + policz3 + policz4 + policz5;
                    wypisz.setText(String.valueOf("Ilość spalonych kalorii: " + wszystko));
                }



            }
        });

    }
}
