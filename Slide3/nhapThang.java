package Slide3;

import java.util.Scanner;

public class nhapThang {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        short month;
        int year;
        month = nhapThang();
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
    }

    public static short nhapThang() {
        Scanner SC = new Scanner(System.in);
        short month;
        do {
            System.out.println("Mời nhập tháng:");
            month = Short.parseShort(SC.nextLine());
        } while (month < 1 || month > 12);
        return month;
    }
}
