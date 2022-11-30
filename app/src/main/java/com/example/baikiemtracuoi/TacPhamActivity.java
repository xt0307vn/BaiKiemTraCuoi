package com.example.baikiemtracuoi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TacPhamActivity extends AppCompatActivity {
    ImageButton trolai;
    TextView tomTacTacPham;
    String idTacPham, idTacGia;
    DuLieu duLieu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tac_pham);

        duLieu = new DuLieu();
        trolai = findViewById(R.id.trolai);
        tomTacTacPham = findViewById(R.id.tomTacTacPham);

        Bundle bundle = getIntent().getExtras();
        idTacPham = bundle.getString("idTacPham");
        idTacGia = bundle.getString("idTacGia");

        for(ThongTinTacPham thongTinTacPham: duLieu.thongTinTacPhams) {
            if(thongTinTacPham.getIdTacGiam().equalsIgnoreCase(idTacGia) && thongTinTacPham.getIdTacPham().equalsIgnoreCase(idTacPham)) {
                tomTacTacPham.setText(thongTinTacPham.getTomTacTacPham());
            }
        }

        trolai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}