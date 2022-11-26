//Dối tượng :Biểu diễn đối tượng trong thế giới thực
        //Thuộc tính(trường-field): miểu tả đối tượng
        //Phương thức: cách thức,hành vi hoạt động của ddooois tượng
        
//Lớp(class):là khuôn mẫu đc sử dụng để mô tả các đối tuongje cùng loại
          //-Thuộc tính(trường-field) miêu tả khuân mẫu
          //-Phương thức:hành vi hoạt động cửa khuân mẫu
          
// SinhVien
//    -Thuộc tính(trường-field):hoTen;diêm
//    -PHương thức:nhap(),xuat(),getXepLoai()...

//Tạo đoia tượng  TenLop ten_Biến= new TenLop()
//        -GOi thuộc tính của dối tượng:ten_Biên.ten_ThuocTInh
   
 //Hàm tạo(constructor)
//    -Đặc điểm:
//        Tên trùng với tên lớp
//        Không trả về giá trị

package Slide4;

import java.util.Scanner;

public class SinhVien {

    //Khai báo thuộc tính <=> khai báo biến
    //Khai báo phương thức <=> khai báo hàm
    private String hoTen;
    private double diem;
    
    //Hàm tạo KHÔNG tham số
   //cách 1: si ctrl + cách
    public SinhVien() {
    }
    //Hàm tạo CÓ tham số :chuột phải chọn Insert Code ==>Contrucso

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    //Bổ sung các phương thức getter và setter để đọc ghi các trường đã che dấu
    //Các phương thức set: gán dữ liệu cho các thuộc tính (trường)
    //Các phương thức get: lấy dữ liệu của các thuộc tính (trường)
    //Cách làm nhanh 
    public void setDiem(double diem){
        this.diem = diem;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    
    //Các phương thức get: lấy dữ liệu cho các thuộc tính (trường)
    public double getDiem(){
        return this.diem;
    }
    public String getHoTen(){
        return hoTen;
    }
    //Từ khóa this trong java là một biến tham chiếu được sử dụng để tham chiếu tới đối tượng của lớp hiện tại.
    //
    //Trong java, Từ khóa this có 6 cách sử dụng như sau:
    //
    //Từ khóa this có thể được dùng để tham chiếu tới biến instance của lớp hiện tại.
    //this() có thể được dùng để gọi Constructor của lớp hiện tại.
    //Từ khóa this có thể được dùng để gọi phương thức của lớp hiện tại.
    //Từ khóa this có thể được truyền như một tham số trong phương thức.
    //Từ khóa this có thể được truyền như một tham số trong phương Constructor.
    //Từ khóa this có thể được dùng để trả về instance của lớp hiện tại.

    
    //Khai báo phương thức <=> khai báo hàm(function)
    public void nhap() {//nhập thông tin chio các thuộc tính
        Scanner SC = new Scanner(System.in);
        System.out.print("Mời nhập họ tên:");
        hoTen = SC.nextLine();
        System.out.print("Mời nhập điểm:");
        diem = Double.parseDouble(SC.nextLine());
    }

    public void xuat() {//xuát thông tin
//        System.out.println("Họ tên:" + hoTen);
//        System.out.println("Diểm:" + diem);
        
        System.out.println(hoTen + "\t" + diem);
    }

    public void inThongTin() {//xuát thông tin
        System.out.println(hoTen + "\t" + diem + "\t" + this.getXepLoai());
    }
    
    //Nạp chồng phương thức getXepLoai
    public String getXepLoai(){
        if(diem < 5){
            return "Trượt";
        }else{
            return "Đạt";
        }
    }
    public String getXepLoai(double diem){
        if(diem < 5){
            return "Trượt";
        }else if(diem <7){
            return "Trung Bình";
        }else{
            return "Tốt";
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", diem=" + diem + "Xep loai:"+getXepLoai()+'}';
    }
  
}
