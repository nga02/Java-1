package Lab5;

import java.util.Scanner;

public class Bai1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoThuc ds = new SoThuc();
        int chon;
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn nhập DSST");
                    ds.nhap();
                    break;
                case 2:
                    System.out.println("Bạn chọn xuất DSST");
                    ds.hienThi();
                    break;
                case 3:
                    System.out.println("Bạn chọn tính tổng DSST");
                    ds.tinhTong();
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
        System.out.println("|3.Tính tổng                       |");
        System.out.println("|0.Thoát                           |");
        System.out.println("+----------------------------------+");
        System.out.println("\n");
        System.out.println("Mời bạn chọn chức năng:");
    }
}
