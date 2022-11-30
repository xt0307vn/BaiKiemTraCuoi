package com.example.baikiemtracuoi;

import java.util.ArrayList;
import java.util.List;

public class DuLieu {
    public List<ThongTinTacPham> thongTinTacPhams = new ArrayList<>();

    public DuLieu() {
        thongTinTacPhams.add(new ThongTinTacPham("xuandieu", "Xuân Diệu", "yeu", "Yêu", "Tóm tắc tác phẩm yêu"));
        thongTinTacPhams.add(new ThongTinTacPham("xuandieu", "Xuân Diệu", "voivang", "Vội Vàng", "Tóm tắc tác phẩm vội vàng"));
        thongTinTacPhams.add(new ThongTinTacPham("nguyendu", "Nguyễn Du", "truyenkieu", "Truyện Kiều", "Tóm tắc tác phẩm truyện Kiều"));
        thongTinTacPhams.add(new ThongTinTacPham("nguyendu", "Nguyễn Du", "bachanhtapluc", "Bắc hành tạp lục", "Tóm tắc tác phẩm Bắc hành tạp lục"));
        thongTinTacPhams.add(new ThongTinTacPham("nguyendu", "Nguyễn Du", "namtrungtapngam", "Nam trung tạp ngâm", "Tóm tắc tác phẩm Nam trung tạp ngâm"));
        thongTinTacPhams.add(new ThongTinTacPham("nguyentuan", "Nguyễn Tuân", "tuybut", "Tùy Bút", "Tóm tắc tác phẩm Tùy Bút"));
        thongTinTacPhams.add(new ThongTinTacPham("nguyentuan", "Nguyễn Tuân", "motchuyendi", "Một Chuyến Đi", "Tóm tắc tác phẩm Một Chuyến Đi"));
        thongTinTacPhams.add(new ThongTinTacPham("nguyentuan", "Nguyễn Tuân", "tocchihoai", "Tóc chị Hoài", "Tóm tắc tác phẩm Tóc chị Hoài"));
        thongTinTacPhams.add(new ThongTinTacPham("xuandieu", "Xuân Diệu", "tatden", "Tắt Đèn", "Tóm tắc tác phẩm Tắt Đèn"));
        thongTinTacPhams.add(new ThongTinTacPham("huycan", "Huy Cận", "tranggiang", "Tràng Giang", "Tóm tắc tác phẩm Tràng Giang"));
        thongTinTacPhams.add(new ThongTinTacPham("huycan", "Huy Cận", "doanthuyendanhca", "Đoàn Thuyền Đánh Cá", "Tóm tắc tác phẩm Đoàn Thuyền Đánh Cá"));
        thongTinTacPhams.add(new ThongTinTacPham("huycan", "Huy Cận", "ngamngui", "Ngậm Ngùi", "Tóm tắc tác phẩm Ngậm Ngùi"));
    }


}
