package Slide2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        //Nhập hệ số phương trình ax+b=0(a!=0) -->in nghiệm 
        Scanner SC = new Scanner(System.in);
        double a, b, x;
        System.out.print("NHập a:");
        a = Double.parseDouble(SC.nextLine());
        System.out.print("NHập b:");
        b = Double.parseDouble(SC.nextLine());

        x = (double) -b / a;//ép kiểu tường minh phần thập phân sẽ bị bỏ
        //int a = 5;
        //double b = 9.4;
        //b = a; //ép kiểu tự động
        //a = (int)b; //ép kiểu tường minh phần thập phân sẽ bị bỏ
        System.out.printf("Nghiệm của pt là:%.1f\n", x);
    }

}
