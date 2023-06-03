package com.example.lab5_ph35992;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class bai4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4dn);
        Button btndangy = findViewById(R.id.btndangky);
        Button btndangnhap = findViewById(R.id.btndangnhap);
        TextInputLayout tiluser = findViewById(R.id.tiluser);
        TextInputLayout tilpass = findViewById(R.id.tilpass);
        TextInputEditText tieuser = findViewById(R.id.tieuser);
        TextInputEditText tiepass = findViewById(R.id.tiepass);
        btndangy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dangky = new Intent(Bai4dn.this,Bai4ttk.class);
                startActivity(dangky);
            }
        });
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nhan= getIntent();
                Bundle dulieu = nhan.getExtras();
                if (dulieu!=null){
                    String name = dulieu.getString("namedk");
                    String pass = dulieu.getString("passdk");
                    Boolean user = name.equals(tieuser.getText().toString());
                    Boolean pas = pass.equals(tiepass.getText().toString());
                    if (user&&pas){
                        Toast.makeText(Bai4dn.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent vao = new Intent(Bai4dn.this,Bai2.class);
                        startActivity(vao);
                    }
                    else {
                        Toast.makeText(Bai4dn.this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Bai4dn.this, "Chưa đăng ký", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    }
}