package com.example.baikiemtracuoi;

public class TacPham {
    String idTacPham, tenTacPaham;

    public TacPham(String idTacPham, String tenTacPaham) {
        this.idTacPham = idTacPham;
        this.tenTacPaham = tenTacPaham;
    }

    public String getIdTacPham() {
        return idTacPham;
    }

    public void setIdTacPham(String idTacPham) {
        this.idTacPham = idTacPham;
    }

    public String getTenTacPaham() {
        return tenTacPaham;
    }

    public void setTenTacPaham(String tenTacPaham) {
        this.tenTacPaham = tenTacPaham;
    }
}
