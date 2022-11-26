package Lab2;

import java.util.Scanner;

public class TonghopLab2 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int chon;
        while (true) {
            menu();
            chon = Integer.parseInt(SC.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("Bạn đã chọn chức năng 1");
                    bai1();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn chức năng 2");
                    bai2();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn chức năng 3");
                    bai3();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn chức năng 4");
                    nhapThang();
                    break;
                case 0:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn không chọn đúng,vui lòng chọn lại:");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("------------Menu-----------");
        System.out.println("1.Giải phương trình bậc 1  ");
        System.out.println("2.Giải phương trình bậc 2  ");
        System.out.println("3.Tính tiền điện           ");
        System.out.println("4.Ngày tháng               ");
        System.out.println("Thoát chương trình");
        System.out.println("---------------------------");

        System.out.println("Mời bạn chọn chức năng:");

    }

    public static void bai1() {
        Scanner SC = new Scanner(System.in);

        int a, b;
        double x;
        System.out.println("Giải phương trình bậc nhất\n");
        System.out.print("Nhập a:");
        a = Integer.parseInt(SC.nextLine());
        System.out.print("Nhập b:");
        b = Integer.parseInt(SC.nextLine());
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            x = -b / a;
            System.out.printf("Phương trình có nghiệm x= %.1f", x);
        }
    }

    public static void bai2() {
        Scanner SC = new Scanner(System.in);
        float a, b, c, delta, x, x1, x2;//khai bao bien

        System.out.print("Nhập a:");
        a = Float.parseFloat(SC.nextLine());
        System.out.print("Nhập b:");
        b = Float.parseFloat(SC.nextLine());
        System.out.print("Nhập c:");
        c = Float.parseFloat(SC.nextLine());

        delta = (float) (Math.pow(b, 2) - 4 * a * c);//tính delta

        if (a == 0) {//kiem tra he so
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                x = (-c / b);
                System.out.printf("Phương trình có một nghiệm kép x=%.1f", x);
            }
        }

        if (delta < 0) {//kiem tra đk delta
            System.out.println("Phương trình vô nghiệm!");
        } else if (delta == 0) {
            x = (-b / (2 * a));
            System.out.printf("Phương trình có nghiệm x1=x2=x=%.1f", x);
        } else {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.printf("Phương trình có 2 nghiệm x1=%.1f ,x2=%.1f", x1, x2);
        }
    }

    public static void bai3() {
        Scanner SC = new Scanner(System.in);
        double soDien, tien;
        System.out.print("Nhập số điện sử dụng của tháng:");
        soDien = Double.parseDouble(SC.nextLine());
        if (soDien > 0 && soDien <= 50) {
            tien = soDien * 1000;
            System.out.println("Tổng tiền phải trả là:" + tien);
        } else {
            tien = soDien * 1200;
            System.out.printf("Tổng tiền phải trả là: %f", tien);
        }
    }

    public static void nhapThang() {
        Scanner SC = new Scanner(System.in);

        do {
            int month, year;

            System.out.print("MỜi nhập tháng:");
            month = Integer.parseInt(SC.nextLine());

            switch (month) {
                case 2:
                    System.out.print("MỜi nhập năm:");
                    year = Integer.parseInt(SC.nextLine());
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println("Năm " + year + " là năm nhuận,tháng 2 có 29 ngày");
                    } else {
                        System.out.println("Năm " + year + " không là năm nhuận,tháng 2 có 28 ngày");
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày!");
                    break;

                default:
                    System.out.println("Không có tháng này!");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng " + month + " có 30 ngày!");
                    break;
            }
        } while (true);
    }
}
//xây dựng hàm short nhapThang():Nhập tháng thỏa mãn từ 1 đến 12
//áp dụng hàm nhapThang vao bai ngay thang :VD gọi mời nhập tháng==> tháng==> nhapThang