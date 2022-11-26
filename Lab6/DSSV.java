package Lab6;

import java.util.ArrayList;

public class DSSV {

    private ArrayList<SinhVien> list = new ArrayList<>();

    public void nhap() {
        for (int i = 0; i < 5; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }
    }

    public void xuat() {
        System.out.println("--------------------------------");
        System.out.println("Danh sach sinh vien");
        for (SinhVien x : list) {
            x.xuat();
        }
    }
}
