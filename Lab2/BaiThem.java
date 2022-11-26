package Lab2;

import java.util.Scanner;

public class BaiThem {

    public static void main(String[] args) {
        // Dùng Switch case 
        //Nhập tháng,năm => in ra số ngày trong tháng
        //Tháng 1,3,5,7,8,10,12 có 31 ngày
        //Tháng 4,6,9,11 có 30 ngày
        //Tháng 2:Năm nhuận có 29 ngày ,Không nhuận có 28 ngày
        int month,year;
        Scanner SC = new Scanner(System.in);
        System.out.print("MỜi nhập tháng:");
        month = Integer.parseInt(SC.nextLine());
        System.out.print("MỜi nhập năm:");
        year = Integer.parseInt(SC.nextLine());
        switch(month){
            case 1:               
            case 3:               
            case 5:               
            case 7:               
            case 8:            
            case 10:              
            case 12:
                System.out.println("Tháng "+ month +" có 31 ngày!");
            break;
            case 2:
                if((year % 4==0 && year %100 !=0)||(year %400==0)){
                    System.out.println("Năm "+ year +" là năm nhuận,tháng 2 có 29 ngày");
                }else{
                    System.out.println("Năm "+ year +" không là năm nhuận,tháng 2 có 28 ngày");
                }
            break;
            default:
                System.out.println("Không có tháng này!");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+ month +" có 30 ngày!");
            break;
        }
    }

}
