package lab1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        //print:xuất xong không xuống dòng
        //println(): Xuất xong có xuống dòng
        //printf(): Xuất có định dạng, các ký tự định dạng
        System.out.print("Bài 1\n");
        Scanner SC = new Scanner(System.in); // tao doi tuong Scanner
        String hoTen;
        float diemTB;
        System.out.print("Mời nhập tên: ");
        hoTen = SC.nextLine();
        System.out.print(" Mời nhập diểm tb: ");
        diemTB = SC.nextFloat();

        System.out.println(" Nhập thông tin vừa nhập là: ");
        System.out.println("Họ tên:" + hoTen);
        System.out.println("Điểm:  " + diemTB);

        System.out.println(" Thông tin vừa nhập là: ");
        System.out.printf("Họ tên:%s\n", hoTen);
        System.out.printf("Điểm: %.2f\n ", diemTB);
    }
}
