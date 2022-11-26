
package Lab4;

import java.util.Scanner;

public class sanpham {
//đặc tả truy xuất private để hạn chế truy xuất trực tiếp đến các trường dữ liệu này
    private String tenSP;
    private double donGia;
    private double giamGia;
    
    public double getThueNhapKhau(){
        return donGia * 0.1;
    }
    
    public void nhap(){
        Scanner SC = new Scanner(System.in); 
        
        System.out.print("Mời nhập tên sản phẩm:");
        tenSP = SC.nextLine();
        
        System.out.print("Mời nhập đơn giá:");
        donGia = Double.parseDouble(SC.nextLine());
        
        System.out.print("Mời nhập mã giảm giá:");
        giamGia = Double.parseDouble(SC.nextLine());
    }
    public void xuat(){
        System.out.printf("Tên sản phẩm:%s | Đơn giá:%f | Giảm giá:%f | Thuế nhập khẩu:%f",
                tenSP,donGia,giamGia,getThueNhapKhau());
        System.out.println("\n");
    }
    
 //    Bài 3
    //  Hàm tạo ko tham số
    public sanpham() {
    }
    
    // Hàm tạo có 2 tham số
    public sanpham(String tenSP, double donGia) {
    //        Không giảm giá
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }
// Hàm tạo có 3 tham số
    public sanpham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

//Bài 4 
    public String getTenSP(){
        return tenSP;
    }
    public void setTenSP(String tenSP){
        this.tenSP = tenSP;
    }
    public double getDonGia(){
        return donGia;
    }
    public void setDonGia(double donGia){
        this.donGia=donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }   
}
