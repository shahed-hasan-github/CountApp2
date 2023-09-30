package com.example.countapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


        int value =0;
        final int min = 10;
        final int max = 1000;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            Button countButton= findViewById(R.id.count_button);
            Button randomButton= findViewById(R.id.random_button);
            TextView topText = findViewById(R.id.top_text);

            countButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    topText.setText(String.valueOf(value++));

                }
            });

            randomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final int random = new Random().nextInt((max - min) + 1) + min;
                    topText.setText(String.valueOf(random));
                }
            });

            randomButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {

                    randomButton.setLongClickable(true);
                    String getStr=topText.getText().toString();
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("valu",getStr);
                    startActivity(i);


                    return true;
                }
            });



        }

        public void show_toast(View view) {
            Toast.makeText(this, "This is a Toast", Toast.LENGTH_SHORT).show();
        }

    }
