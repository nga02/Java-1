package lab1;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        // Nhap thong tin nguoi yeu:
        //name(String),age(int);weight(double)2chuso thập phân --> in ra println + printf
        String name;
        int age;
        double weight;
        Scanner SC = new Scanner(System.in);

        System.out.println("Thông tin người yêu");
        System.out.print("Nhập tên:");
        name = SC.nextLine();//xử lý trôi lệnh;
        System.out.print("Nhập tuổi:");
        age = Integer.parseInt(SC.nextLine());//đọc vào 1 chuỗi --> chuyển chuỗi thành số nguyên
        System.out.print("Nhập cân nặng:");
        weight = Double.parseDouble(SC.nextLine());//đọc vào 1 chuỗi--> chuyển chuỗi thành số thực
        // SC.nextDouble();
        //SC.nextLine();

        System.out.println("Thông tin người yêu");
        System.out.println("Tên người ấy là:" + name);
        System.out.println("Tuổi người ấy là:" + age);
        System.out.println("Cân nặng người ấy la:" + weight);

        System.out.println("Thông tin người yêu");
        System.out.printf("Tên người ấy là:%s\n", name);
        System.out.printf("Tuổi người ấy là:%d\n", age);
        System.out.printf("Cân nặng người ấy là:%.2f\n", weight);

    }

}
