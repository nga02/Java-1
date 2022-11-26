
package Slide3;

import java.util.Scanner;


public class VD4 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng sinh viên:");
        n = Integer.parseInt(SC.nextLine());
        
        
        String[] ten= new String[n];
        double[] diem=new double[n];
        for(int i=0; i< ten.length;i++){
            System.out.printf("Nhập tên sv thứ [%d]:", i + 1);//sout
            ten[i] = SC.nextLine();
            System.out.printf("Nhập điểm của sv thứ [%d:", i + 1);
            diem[i] = Double.parseDouble(SC.nextLine());
        }
        System.out.print("Xuất mảng:");
        for(int i = 0; i< ten.length;i++){
            System.out.println(ten[i] + "\t" + diem[i]);
        }
        // Sawps xep giam dan
        
        for(int i =0; i<diem.length-1;i++){
            for(int j = i+1; j < diem.length;j++){
                if(diem[i]< diem[j]){
                    double temp = diem[i];
                    diem[i]=diem[j];
                    diem[j]=temp;
                    //them 3 dong nữa để đổi chỗ cho tên
                    String svTemp = ten[i];
                    ten[i] = ten[j];
                    ten[j] = svTemp;
                }
            }
        }
        System.out.print("Sắp xếp giảm dần:");
        for(int i = 0; i< ten.length;i++){
            System.out.println(ten[i] + "\t" + diem[i]);
        }
    }
    
}
