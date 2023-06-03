package com.example.lab5_ph35992;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class bai1 extends AppCompatActivity {
    String tenCoSo;
    ArrayList<school> list = new ArrayList<school>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        Spinner spbai1 = findViewById(R.id.spinerdiachi);
        Button btnsub = findViewById(R.id.btnsubmit);
        //them doi tuong vao list
        list.add(new school(R.drawable.hn,"Hà Nội"));
        list.add(new school(R.drawable.hcm,"Hồ Chí Minh"));
        list.add(new school(R.drawable.dn,"Đà Nẵng"));
        list.add(new school(R.drawable.hue,"Huế"));
        list.add(new school(R.drawable.tn,"Tây Nguyên"));
        list.add(new school(R.drawable.cantho,"Cần Thơ"));
        //
        schooladapter adapter = new schooladapter(this,list);
        //do du lieu len spiner
        spbai1.setAdapter(adapter);
        EditText txtten = findViewById(R.id.txtten);
        EditText txtdiachi = findViewById(R.id.txtdiachi);

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Bai1.this,Bai2.class);
                Bundle bundle = new Bundle();
                //
                String ht = txtten.getText().toString();
                String dc = txtdiachi.getText().toString();
                // gui du liệu đi
                bundle.putString("ht",ht);
                bundle.putString("dc",dc);
                bundle.putString("tenCoSo",tenCoSo);
                //
                intent1.putExtras(bundle);
                setResult(1,intent1);
                finish();
            }
        });
        //Lấy giá trị tên trong Spiner
        spbai1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                tenCoSo = list.get(i).getTencs();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    }