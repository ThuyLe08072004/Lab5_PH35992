package com.example.lab5_ph35992;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnvd1 = findViewById(R.id.btnvd1);
        Button btnbai1 = findViewById(R.id.btnbai1);
        Button btnbai2 = findViewById(R.id.btnbai2);
        Button btnbai4 = findViewById(R.id.btnbai4);
        btnvd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,vidu1.class);
                startActivity(intent1);
            }
        });
        btnbai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,Bai1.class);
                startActivity(intent2);
            }
        });
        btnbai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,Bai2.class);
                startActivity(intent3);
            }
        });
        btnbai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,Bai4dn.class);
                startActivity(intent4);
            }
        });
    }
    }