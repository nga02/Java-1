package Lab2;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
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

}
