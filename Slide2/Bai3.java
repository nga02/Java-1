package Slide2;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        // Nhập vào điểm ==> in xếp loại
        //Nếu điểm< 5==> trượt
        //Cách 1: Dùng toán tử điểu kiện
        //Cách 2: Dùng if else
        Scanner SC = new Scanner(System.in);
        double diem;
        System.out.print("Nhập điểm:");
        diem = Double.parseDouble(SC.nextLine());

        System.out.printf("Điểm vừa nhập là:%.1f", diem);

        //Cách 1: Dùng toán tử điều kiện
        String xeploai = diem < 5 ? "Trượt" : "Đạt";
        System.out.println("\nXếp loại: " + xeploai);

        //Cách 2: Dùng if else
        if (diem < 5) {
            System.out.println("Trượt!");
        } else {
            System.out.println("Đạt!");
        }

        // Xếp loại dùng nhiều if
        //Nếu điểm < 5 ==> trượt 
        //Nếu điểm từ 5-->7 : trung bình
        //Còn lại :tốt
        if (diem < 5) {
            System.out.println("Xếp loại:Trượt!");
        } else if (diem >= 5 && diem <= 7) {
            System.out.println("Xếp loại:Trung bình!");
        } else {
            System.out.println("Xếp loại:Tốt");
        }
    }

}
