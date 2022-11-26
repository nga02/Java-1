package Slide3;

import java.util.Scanner;

public class BangCuuChuong {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        //int x=5;%d
        System.out.println("Bảng cửu chương 5:");
        for (int i = 1; i < 10; i++) {
            System.out.printf("5*%d=%d\n", i, i * 5);
        }

        //In bảng cửu chương
        System.out.println("Bảng cửu chương :");
        for (int i = 2; i < 10; i++) {
            for (int x = 1; x < 10; x++) {
                System.out.printf("%d*%d=%d\n", i, x, x * i);
            }
            System.out.println("");

        }
    }

}
