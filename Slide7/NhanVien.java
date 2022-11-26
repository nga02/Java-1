
package Slide7;

import java.util.Scanner;

public class NhanVien {
//    Khai báo hai thuộc tính
    private String hoTen;
    private double luong;
//Hàm tạo

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public NhanVien() {

    }

// set, get
    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

// To string
    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", luong=" + luong + '}';
    }
//    Nhập

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Mời nhập lương: ");
        luong = Double.parseDouble(sc.nextLine());
    }
//    Xuất

    public void inThongTin() {
//        System.out.println(hoTen + "\t" + luong);
        System.out.println(toString());
    }
}

