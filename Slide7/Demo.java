package Slide7;

public class Demo {

    public static void main(String[] args) {
        //     Tạo đối tượng nhân viên dung hàm tạo có tham số
        NhanVien nv = new NhanVien("kiên", 10000);
//     Xuất thông tin nhân viên
        nv.inThongTin();
//     Xuất thông tin nhân viên dùng toString
        System.out.println(nv.toString());
        System.out.println(nv);

//    Tao đói tượng trưởng phòng dùng hàm tạo có tham số
        TruongPhong tp = new TruongPhong("Hoa", 1200, 100);
//    Xuất thông tin dùng xuất
        tp.inThongTin();
//    Xuất thông tin dùng toString
        System.out.println(tp);

//         Tạo đt TruongPhong2 dùng hàm tạo ko tham số
        TruongPhong tp2 = new TruongPhong();
//    Nhập thông tin tp2
        tp2.nhap();
//    Xuất thông tin tp2
        System.out.println(tp2);
    }

}

