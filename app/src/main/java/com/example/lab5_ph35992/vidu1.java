package com.example.lab5_ph35992;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class vidu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidu1);
        //khai bao mang luu tru du lieu
        String[] tenKhoa = new String[]{"CNTT","Kinh Tế","Cơ Bản","Điện"};
        //
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, tenKhoa
        );
        //đổ dữ liệu lên spiner
        spvd1.setAdapter(adapter);
        //xu li su kien khi cick chon item
        spvd1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(vidu1.this, tenKhoa[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}