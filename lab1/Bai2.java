package lab1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        int dai,rong,CanhNhoNhat;
        double chuVi,dienTich;
        Scanner SC = new Scanner(System.in);
        
        System.out.print("Bai2");
        System.out.print("Nhập chiều dài:");
        dai = SC.nextInt();
        System.out.print("Nhập chiều rộng:");
        rong = SC.nextInt();
       
        chuVi = (dai + rong)*2;
        dienTich = dai + rong;
        CanhNhoNhat = Math.min(dai, rong);
        
        System.out.println("Chu vi là: "+chuVi);// In ra chuvi
        System.out.println("Diện tích là: "+dienTich);
        System.out.println("Cạnh nhỏ nhất là: "+CanhNhoNhat);
        
        //System.out.printf("Chu vi là: %.2f \n",chuVi);
        //System.out.printf("Diện tích là: %.2f \n",dienTich);
        //System.out.printf("Cạnh nhỏ nhất là: %d",CanhNhoNhat);
    }
}
