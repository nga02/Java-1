package lab1;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        float a;
        double v;
        System.out.print("Bai3");
        Scanner SC = new Scanner(System.in);
        System.out.printf("Nhập cạnh lập phương:");
        a = SC.nextFloat();
        v = Math.pow(a, 3);

        System.out.printf("Thể tích hình lập phương là: %.2f\n", v);    
    }
}
