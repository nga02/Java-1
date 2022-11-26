//SanPham: Masp, tenSP, gia có phạm vi truy cập trong nội bộ lớp
//	Ham tao, set, get, toString
//	Nhap
//	Xuat
//
//QLSP:
//-	ArrayList<SanPham>
//-	Các phương thức như Ass ()
//+ Khởi tạo(): Thêm 3 phần tử vào list
//+ nhậpDSSP. Có hỏi tiếp tục
//+ xuấtDSSP.
//+ Sắp xếp theo DonGia Giảm dần.
//Demo: chứa main, dùng để tổ chức chương trình và gọi các phương thức đã xây dựng trong QLSP  giống Ass1
package Slide5;

import java.util.Scanner;

public class SPham {
    private String maSP;
    private String tenSP;
    private double gia;

    public SPham() {
    }

    public SPham(String maSP, String tenSP, double gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", gia=" + gia + '}';
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void nhap() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Mời nhập mã sản phẩm");
        maSP = SC.nextLine();
        System.out.println("Mời nhập tên sản phẩm:");
        tenSP = SC.nextLine();
        System.out.println("Mời nhập đơn giá:");
        gia = Double.parseDouble(SC.nextLine());
    }
    public void xuat() {//in thông tin   
        System.out.println(tenSP + "\t" + gia+ "\t"+ maSP);  //CHẾT TIỆT  
    }    
}
