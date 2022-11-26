package Slide6;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        //Nhập họ đệm, tên
        Scanner sc = new Scanner(System.in);
        String hoTen;
        System.out.println("Mời nhập họ tên:");
        hoTen = sc.nextLine();

        System.out.println("\nHọ tên vừa nhập:" + hoTen);
        System.out.println("In hoa:" + hoTen.toUpperCase());
        System.out.println("In thường:" + hoTen.toLowerCase());
        System.out.println("Độ dài:" + hoTen.length());

        //Tách họ, đệm tên
        int vtd = hoTen.indexOf(" ");//Tìm vị trí xuất hiện đầu tiên của chuỗi con;
        int vtc = hoTen.lastIndexOf(" ");//Tìm vị trí xuất hiện cuối cùng của chuỗi con;

        String ho = hoTen.substring(0, vtd);
        String dem = hoTen.substring(vtd + 1, vtc);
        String ten = hoTen.substring(vtc + 1);
        
        System.out.println("Họ:"+ho);
        System.out.println("Đệm:"+dem);
        System.out.println("Tên:"+ten);
        System.out.println("Tên in hoa:"+ten.toUpperCase());
    }
}
