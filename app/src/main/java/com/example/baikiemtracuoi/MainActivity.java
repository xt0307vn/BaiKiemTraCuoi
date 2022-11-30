package com.example.baikiemtracuoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView main_rcv;
    List<TacGia> tacGiaList;
    TacGiaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_rcv = findViewById(R.id.main_rcv);
        main_rcv.setLayoutManager(new LinearLayoutManager(this));


        tacGiaList = new ArrayList<>();
        adapter = new TacGiaAdapter(this, tacGiaList);
        main_rcv.setAdapter(adapter);

        tacGiaList.add(new TacGia("huycan", "Huy Cận"));
        tacGiaList.add(new TacGia("nguyendu", "Nguyễn Du"));
        tacGiaList.add(new TacGia("nguyentuan", "Nguyễn Tuân"));
        tacGiaList.add(new TacGia("ngotatto", "Ngô Tất Tố"));
        tacGiaList.add(new TacGia("xuandieu", "Xuân Diệu"));


    }
}