package com.example.lab5_ph35992;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class bai4dk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4dk);
        TextInputLayout tiluserdk = findViewById(R.id.tiluserdk);
        TextInputLayout tilpassdk = findViewById(R.id.tilpassdk);
        TextInputLayout tilpassconfim = findViewById(R.id.tilpassconfim);
        TextInputEditText tieuserdk = findViewById(R.id.tieuserdk);
        TextInputEditText tiepassdk = findViewById(R.id.tiepassdk);
        TextInputEditText tiepassconfim = findViewById(R.id.tiepassconfim);
        Button btndangnhap1 = findViewById(R.id.btndangnhap1);
        Button btntrove = findViewById(R.id.btntrove);
        btndangnhap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namedk = tieuserdk.getText().toString();
                String passdk = tiepassdk.getText().toString();
                String confim = tiepassconfim.getText().toString();
                if (TextUtils.isEmpty(namedk)||TextUtils.isEmpty(passdk)||TextUtils.isEmpty(confim)){
                    Toast.makeText(Bai4ttk.this, "Không được để trống Tên hoặc mật khẩu đăng ký", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (passdk.equals(confim)) {
                        Toast.makeText(Bai4ttk.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                        //gửi dữ liệu đi
                        Intent gui = new Intent(Bai4ttk.this, Bai4dn.class);
                        Bundle dulieu = new Bundle();
                        dulieu.putString("namedk", namedk);
                        dulieu.putString("passdk", passdk);
                        gui.putExtras(dulieu);
                        startActivity(gui);
                    } else {
                        Toast.makeText(Bai4ttk.this, "Đăng ký không thành công", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        btntrove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trove = new Intent(Bai4ttk.this,Bai4dn.class);
                startActivity(trove);
            }
        });
    }
    }
}