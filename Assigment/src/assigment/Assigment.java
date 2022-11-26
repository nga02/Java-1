package assigment;

import java.util.Scanner;

public class Assigment {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int chon;
        QLNV ql = new QLNV();
        while (true) {
            menu();
            chon = Integer.parseInt(SC.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Chức năng 1:Nhập danh sách nhân viên từ bàn phím!");
                    ql.nhapDSNV();
                    break;

                case 2:
                    System.out.println("Chức năng 2. Xuất danh sách nhân viên ra màn hình!");
                    ql.xuatDSNV();
                    break;
                case 10:
                    System.out.println("Chuc nang 10:Khoi tao");
                    ql.khoiTao();
                    ql.xuatDSNV();
                    break;
                case 11:
                    System.out.println("Bạn chọn kế thừa");
                    ql.keThua();
                    break;
                case 3:
                    System.out.println("Chức năng 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím !");
                    ql.timTheoMaNV();
                    break;
                case 4:
                    System.out.println("Chức năng 4. Xóa nhân viên theo mã nhập từ bàn phím  !");//lag
                    ql.xoaTheoMaNV();
                    System.out.println("DSNV sau khi xóa!");
                    ql.xuatDSNV();
                    break;
                case 5:
                    System.out.println("Chức năng 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím!");//lag 
                    ql.capNhatTheoMa();
                    break;
                case 6:
                    System.out.println("Chức năng 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím!");
                    ql.timTheoKhoangLuong();
                    break;
                case 7:
                    System.out.println("Chức năng 7. Sắp xếp nhân viên theo họ và tên    !");
                    ql.xepTheoHoTen();
                    break;
                case 8:
                    System.out.println("Chức năng 8. Sắp xếp nhân viên theo thu nhập giảm dần !");
                    ql.xepTheoThuNhap();
                    break;
                case 9:
                    System.out.println("Chức năng 9. Xuất 5 nhân viên có thu nhập cao nhất!");// xuaats ko ra
                    ql.namNhanVienTNCN();
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập không đúng,vui lòng nhập lại!");
                    break;
            }

        }
    }

    public static void menu() {
        System.out.println("+--------------------------------Menu----------------------------+");
        System.out.println("|1. Nhập danh sách nhân viên từ bàn phím                         |");
        System.out.println("|2. Xuất danh sách nhân viên ra màn hình                         |");
        System.out.println("|3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím           |");
        System.out.println("|4. Xóa nhân viên theo mã nhập từ bàn phím                       |");
        System.out.println("|5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím        |");
        System.out.println("|6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím         |");
        System.out.println("|7. Sắp xếp nhân viên theo họ và tên                             |");
        System.out.println("|8. Sắp xếp nhân viên theo thu nhập                              |");
        System.out.println("|9. Xuất 5 nhân viên có thu nhập cao nhất                        |");
        System.out.println("|10.Khoi tao danh sach nhan vien                                 |");
        System.out.println("|11.Kế thừa                                                      |");
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("\n");
        System.out.println("Mời bạn chọn chức năng:");
    }

}
