package com.example.baikiemtracuoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TacGiaActivity extends AppCompatActivity {
    RecyclerView tacgia_rcv;
    ImageButton trolai;
    List<TacPham> tacPhamList;
    TacPhamAdapter adapter;
    TextView idTacGia;

    DuLieu duLieu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tac_gia);

        tacgia_rcv= findViewById(R.id.tacgia_rcv);
        duLieu = new DuLieu();

        tacPhamList = new ArrayList<>();
        adapter = new TacPhamAdapter(this, tacPhamList);
        tacgia_rcv.setLayoutManager(new LinearLayoutManager(this));
        tacgia_rcv.setAdapter(adapter);



        trolai = findViewById(R.id.trolai);
        trolai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Bundle bundle = getIntent().getExtras();
        String idTacGia = bundle.getString("idTacGia");

        for(ThongTinTacPham thongTinTacPham: duLieu.thongTinTacPhams) {
            if(thongTinTacPham.getIdTacGiam().equalsIgnoreCase(idTacGia)) {
                tacPhamList.add(new TacPham(thongTinTacPham.getIdTacPham(), thongTinTacPham.getTenTacPham()));
            }
            adapter.notifyDataSetChanged();
        }

    }
}