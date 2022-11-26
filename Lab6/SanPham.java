
package Lab6;

import java.util.Scanner;

public class SanPham {
    private String ten;
    private double gia;
    private String hang;

    public SanPham() {
    }

    public SanPham(String ten, double gia, String hang) {
        this.ten = ten;
        this.gia = gia;
        this.hang = hang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Override
    public String toString() {
        return "SanPham{" + "ten=" + ten + ", gia=" + gia + ", hang=" + hang + '}';
    }
    
    public void nhap() {      
        Scanner SC = new Scanner(System.in);
        System.out.print("Mời nhập tên sản phẩm:");
        ten = SC.nextLine();
        System.out.print("Mời nhập tên hãng:");
        hang = SC.nextLine();
        System.out.print("Mời nhập đơn giá:");
        gia = Double.parseDouble(SC.nextLine());
    }
    
    public void xuat(){   
        System.out.println(ten + "\t" + gia+ "\t"+ hang); 
    } 
}
