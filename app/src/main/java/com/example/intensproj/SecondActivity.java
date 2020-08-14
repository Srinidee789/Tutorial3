package com.example.intensproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.editTextTextPersonName2);
        TextView textView1 = findViewById(R.id.editTextTextPersonName);
        textView.setText(message);
        textView1.setText(message);


        }

    }

