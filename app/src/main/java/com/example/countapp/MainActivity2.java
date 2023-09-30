package com.example.countapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView= findViewById(R.id.top_text2);

        String s = getIntent().getExtras().getString("valu");

        textView.setText(s);



    }

    public void previous_screen(View view) {
        Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
}