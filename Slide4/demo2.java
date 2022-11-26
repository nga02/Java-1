
package Slide4;

public class demo2 {

    public static void main(String[] args) {
        // Tạo đối tượng sinh viên sử dụng hàm tạo có tham số
        SinhVien sv = new SinhVien("Le Anh", 10);
        //Xuất thông tin
        //sv.xuat();
        //sv.inThongTin();
        System.out.println(sv.toString());
        System.out.println(sv);//khoong can gọi toString mặc định toString đã đc gọi
    }    
}
