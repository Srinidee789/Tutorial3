package com.example.intensproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.intensproj";
    Button button;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclickButtonLister();
    }
    public void onclickButtonLister() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text = "Navigating  to activity 2";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context,text,duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL, 0 ,0);
                        toast.show();
                        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                        startActivity(intent);
                    }

                }
        );
    }
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this,SecondActivity .class);
        EditText editText = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText editText1 = (EditText)findViewById((R.id.editTextTextPersonName2));
        String message = editText.getText().toString();
        String message1 = editText1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        intent.putExtra(EXTRA_MESSAGE,message1);
        startActivity(intent);



    }


    }
