package com.example.iotkeyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;


import android.os.Bundle;
import android.widget.Button;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final Button goToTypingTest = findViewById(R.id.goToTypingTest);
            goToTypingTest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), TypingTest.class);
                    startActivity(intent);
                    //hello

                }
            });

            final Button goToKeyTest = findViewById(R.id.goToKeyTest);
            goToKeyTest.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), keyTest.class);
                    startActivity(intent);
                    //hello
                }
            }));



        }


    @Override
    public void onClick(View v) {

    }
}