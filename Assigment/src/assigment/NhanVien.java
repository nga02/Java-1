package assigment;

import java.util.Scanner;

public class NhanVien {

    private String maNV;
    private String hoTen;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", luong=" + luong + '}';
    }

    public Double getThuNhap() {
        return this.luong;
    }

    public Double getThueThuNhap() {
        if (this.getThuNhap() < 9000000) {
            return 0.0;
        } else if (this.getThuNhap() < 15000000) {
            return this.getThuNhap() * 0.1;
        } else {
            return this.getThuNhap() * 0.12;
        }
    }

    public void xuat() {
        System.out.println(toString());
    }

}
