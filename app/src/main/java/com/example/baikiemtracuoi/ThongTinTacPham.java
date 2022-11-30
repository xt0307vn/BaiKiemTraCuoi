package com.example.baikiemtracuoi;

import java.util.ArrayList;
import java.util.List;

public class ThongTinTacPham {
    String idTacGiam, tenTacGia, idTacPham, tenTacPham, tomTacTacPham;

    public ThongTinTacPham(String idTacGiam, String tenTacGia, String idTacPham, String tenTacPham, String tomTacTacPham) {
        this.idTacGiam = idTacGiam;
        this.tenTacGia = tenTacGia;
        this.idTacPham = idTacPham;
        this.tenTacPham = tenTacPham;
        this.tomTacTacPham = tomTacTacPham;
    }

    public String getIdTacGiam() {
        return idTacGiam;
    }

    public void setIdTacGiam(String idTacGiam) {
        this.idTacGiam = idTacGiam;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getIdTacPham() {
        return idTacPham;
    }

    public void setIdTacPham(String idTacPham) {
        this.idTacPham = idTacPham;
    }

    public String getTenTacPham() {
        return tenTacPham;
    }

    public void setTenTacPham(String tenTacPham) {
        this.tenTacPham = tenTacPham;
    }

    public String getTomTacTacPham() {
        return tomTacTacPham;
    }

    public void setTomTacTacPham(String tomTacTacPham) {
        this.tomTacTacPham = tomTacTacPham;
    }



}
