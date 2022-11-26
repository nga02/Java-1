package poly2;

import java.util.Scanner;

public class SinhVien {
    //Khai báo thuộc tính hoTen, diem

    private String hoTen;
    private double diem;

    //HÀM TẠO
    //làm nhanh: insert code
    public SinhVien() {
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    //insert code => set and get
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

//
    //toSTring
    //làm nhanh: insert code
    @Override    
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", diem=" + diem + '}';
    }

    //nhap()
    public void nhap() {
        //Nhập thông tin cho các thuộc tính
        Scanner SC = new Scanner(System.in);
        System.out.println("Mời nhập họ tên");
        hoTen = SC.nextLine();
        System.out.println("Mời nhập điểm:");
        diem = Double.parseDouble(SC.nextLine());
    }
    //xuat()  

    public void inThongTin() {//in thông tin
    //System.out.println("Họ tên:" +hoTen + "\tĐiểm:" + diem);
        System.out.println(toString());    
    }
     
}
