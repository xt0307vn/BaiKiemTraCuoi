package com.example.baikiemtracuoi;

public class TacGia {
    String idTacGia, tenTacGia;

    public TacGia(String idtacgia, String tentacgia) {
        this.idTacGia = idtacgia;
        this.tenTacGia = tentacgia;
    }

    public String getIdTacGia() {
        return idTacGia;
    }

    public void setIdTacGia(String idTacGia) {
        this.idTacGia = idTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
}
