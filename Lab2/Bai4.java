package Lab2;

import java.util.Scanner;

public class Bai4 {
    public static void bai1(){
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
    public static void bai2(){
        Scanner SC =new Scanner(System.in);
        float a,b,c,delta,x,x1,x2;//khai bao bien
        
        System.out.print("Nhập a:");
        a=Float.parseFloat(SC.nextLine());
        System.out.print("Nhập b:");
        b=Float.parseFloat(SC.nextLine());
        System.out.print("Nhập c:");
        c=Float.parseFloat(SC.nextLine());
        
        delta=(float) (Math.pow(b,2)-4*a*c);//tính delta
        
        if (a == 0) {//kiem tra he so
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                x=(-c/b);
                System.out.printf("Phương trình có một nghiệm kép x=%.1f",x);
            }
        }
        
        if(delta<0){//kiem tra đk delta
            System.out.println("Phương trình vô nghiệm!");
        }
        else if(delta==0){
            x=(-b/(2*a));
            System.out.printf("Phương trình có nghiệm x1=x2=x=%.1f",x);
        }
        else{
            x1=(float) ((-b+Math.sqrt(delta))/(2*a));
            x2=(float) ((-b-Math.sqrt(delta))/(2*a));
            System.out.printf("Phương trình có 2 nghiệm x1=%.1f ,x2=%.1f",x1,x2);
        }
    }
     public static void bai3(){
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
    public static void main(String[] args) {
        do {
            Scanner SC = new Scanner(System.in);
            int chon;
            System.out.println("------------Menu-----------");
            System.out.println("1.Giải phương trình bậc 1  ");
            System.out.println("2.Giải phương trình bậc 2  ");
            System.out.println("3.Tính tiền điện           ");
            System.out.println("Thoát chương trình");
            System.out.println("---------------------------");
            
            System.out.println("Mời bạn chọn chức năng:");
            chon = Integer.parseInt(SC.nextLine());
            
            switch (chon) {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hay nhap tu 0-3!");
                    break;
            }
        } while (true);
    }  
}
