
package Slide4;

public class demo {
    public static void main(String[] args){
        //Tạo đói tượng SinhVien sv1,sv2
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        
        //Nhập thông tin cho sv1,sv2
        System.out.println("Nhập thông tin cho sv1");
        sv1.nhap();
        System.out.println("Nhập thông tin cho sv2");
        sv2.nhap();
        
        //Xuất thông tin sv1,sv2
        System.out.println("\nThông tin sv vừa nhập:");
//        System.out.println("Tên \t Điểm");
        sv1.xuat();//sv1.inThongTin();
        sv2.xuat();//sv2.inThongTin();
        
        //Tên của sv2 là
//        System.out.println("Họ tên SV2:"+sv2.hoTen);
        System.out.println("Họ tên:"+sv2.getHoTen());
        //sửa tên của sv2 thành tên mình
//        sv2.hoTen = "Lê Thị Nga";
        sv2.setHoTen("Lê Thị Nga");
        //sửa điểm của sv2 thành 9.5
//        sv2.diem = 10;
        sv2.setDiem(10);
        //in thông tin sv2 sau khi sửa
        System.out.println("\n Thông tin sv2  sau khi sửa là");
//        sv2.xuat();//sv2.inThongTin();
        System.out.println("sv2");
    }
    
}
