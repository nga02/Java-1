package poly2;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLSV q1 = new QLSV();
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn nhập DSSV");
                    q1.nhapDSSV();
                    break;
                case 2:
                    System.out.println("Bạn chọn xuất DSSV");
                    q1.xuatDSSV();
                    break;

                case 3:
                    System.out.println("Bạn chonnj tìm kiếm theo họ tên");
                    q1.timTheoHoTen();
                case 6:
                    System.out.println("Bạn chọn tìm theo khoảng điểm");
                    q1.timTheoKhoangDiem();
                case 7:
                    System.out.println("Sắp theo họ tên");
                    q1.sapTheoHoTen_Lamda();
                    break;
                case 8:
                    System.out.println("Sắp theo điểm Lamda:");
                    q1.sapTheoDiem_Lambda();
                    break;
                case 11:
                    System.out.println("Bạn chọn khởi tạo dữ liệu");
                    q1.khoiTao();
                    System.out.println("Đã khởi tạo dữ liệu");
                    q1.xuatDSSV();
                    break;
                case 12:
                    System.out.println("Bạn chọn kế thừa");
                    SinhVienIT sv = new SinhVienIT("Le Mai", 10, 15);
//                    System.out.println("sv");
                    sv.inThongTin();
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn chọn không đúng vui lòng nhập lại:");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("+-----------------Menu-------------+");
        System.out.println("|1.Nhập                            |");
        System.out.println("|2.Xuất                            |");
        System.out.println("|3.Tìm theo họ tên                 |");
        System.out.println("|6.Tìm  theo khoảng điểm:          |");
        System.out.println("|7.Sắp theo họ tên  Lambda         |");
        System.out.println("|8.Sắp theo điểm Lamda             |");
        System.out.println("|11.Khoi tao                       |");
        System.out.println("|0.Thoát                           |");
        System.out.println("+----------------------------------+");
        System.out.println("\n");
        System.out.println("Mời bạn chọn chức năng:");
    }
}
