package Slide5;

import java.util.Scanner;

public class BTthemLab5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLSPham q1 = new QLSPham();
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn nhập DSSP");
                    q1.nhapDSSP();
                    break;
                case 2:
                    System.out.println("Bạn chọn xuất DSSP");
                    q1.xuatDSSP();
                    break;
                case 3:
                    System.out.println("Sắp theo giá:");
                    q1.sapTheoGia_Lambda();
                    break;
                case 4:
                    System.out.println("Bạn chọn khởi tạo dữ liệu");
                    q1.khoiTao();
                    break;
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
        System.out.println("|3.Sắp theo giá giảm dần Lambda    |");
        System.out.println("|4.Khoi tao                       |");
        System.out.println("|0.Thoát                           |");
        System.out.println("+----------------------------------+");
        System.out.println("\n");
        System.out.println("Mời bạn chọn chức năng:");
    }
}


