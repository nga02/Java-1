package Lab2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
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
            x=-b/a;
            System.out.printf("Phương trình có nghiệm x= %.1f",x);
        }

    }

}
