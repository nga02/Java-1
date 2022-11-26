package Slide2;

import java.util.Scanner;

public class Tonghop {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int chon;
        while (true) { 
            menu();
            chon = Integer.parseInt(SC.nextLine());

            switch (chon) {
                case 1:
                     System.out.println("Bạn đã chọn chức năng 1");
                     nhaptuoi();
                    break;
                case 2:
                     System.out.println("Bạn đã chọn chức năng 2");
                     xeploai();
                    break; 
                case 0:
                     System.out.println("Thoát");
                     System.exit(0);
                    break;
                default:
                   System.out.println("Bạn không chọn đúng,vui lòng chọn lại:");
                   break;
            }
        } 
    }

    public static void menu() {//gọi trực tiếp trong main phải thêm static

        System.out.println("---------------------------------");
        System.out.println("|1.Nhập tuổi:                    |");
        System.out.println("|2.Xếp loại:                     |");
        System.out.println("|0.Thoát                         |");
        System.out.println("---------------------------------");
        System.out.println("Mời bạn chọn chức năng: ");

    }
//coppy trong main sau mục  public static void main(String[] args) {
    public static void nhaptuoi() {
        byte tuoi;
        Scanner SC = new Scanner(System.in);
        //khai báo ở ngoài TRY để giá trị sử dụng rộng hơn
        //dùng try catch để tránh lỗi đỏ lòm khi chạy
        try {
            //Nội dung nằm trong try
            System.out.print("Nhập tuổi");
            tuoi = Byte.parseByte(SC.nextLine());
            System.out.println("In tuoi:" + tuoi);
        } catch (NumberFormatException ex) {
            //lỗi nằm trong catch
            System.out.println("Vui lòng nhập số !");
        }
    }

    public static void xeploai() {
        Scanner SC = new Scanner(System.in);
        double diem;
        System.out.print("Nhập điểm:");
        diem = Double.parseDouble(SC.nextLine());

        System.out.printf("Điểm vừa nhập là:%.1f", diem);

        //Cách 1: Dùng toán tử điều kiện
        String xeploai = diem == 1 ? "Trượt" :diem == 2 ?"Đạt":"khong ro";
        System.out.println("\nXếp loại: " + xeploai);
    }
}

