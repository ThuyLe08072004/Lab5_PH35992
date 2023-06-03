package com.example.lab5_ph35992;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class bai2 extends AppCompatActivity {
    ArrayList<ttcanhan> list = new ArrayList<ttcanhan>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        ListView listdanhsach = findViewById(R.id.listdanhsach);
        Button btnthem = findViewById(R.id.btnthem);
        //them doi tuong vao list
        list.add(new ttcanhan("Ngọc Minh","Hà Nội","Hà Nội"));
        list.add(new ttcanhan("A","A","Huế"));
        list.add(new ttcanhan("Ngọc Minh","Hà Nội","Hà Nội"));
        list.add(new ttcanhan("A","A","Huế"));
        list.add(new ttcanhan("Ngọc Minh","Hà Nội","Hà Nội"));
        list.add(new ttcanhan("A","A","Huế"));
        //
        ttcanhanadapter adapter = new ttcanhanadapter(this,list);
        //do du lieu len spiner
        listdanhsach.setAdapter(adapter);
        //lang nghe dữ liệu trả về
        //
        ActivityResultLauncher<Intent> getdl = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        //nhận dữ liệu trả về
                        if  (result.getResultCode()==1){
                            Intent intent = result.getData();
                            if (intent != null){
                                Bundle bundle = intent.getExtras();
                                String tencs = bundle.getString("tenCoSo");
                                String hoten = bundle.getString("ht");
                                String diachi = bundle.getString("dc");
                                list.add(new ttcanhan(hoten,diachi,tencs));
                                adapter.notifyDataSetChanged();
                            }
                        }
                    }
                });
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Bai2.this,Bai1.class);
                getdl.launch(intent2);
            }
        });
    }
    }
}