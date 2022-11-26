
package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n;
        System.out.print("Nhập số phần tử của mảng:");
        n=Integer.parseInt(SC.nextLine());
        
        //Nhập mảng
        double arr[]=new double[n];
        for(int i = 0;i < arr.length;i++){
            System.out.printf("Nhập phần tử thứ [%d]:",i+1);
            arr[i]=Double.parseDouble(SC.nextLine());
        }
        //Sắp xếp
        Arrays.sort(arr);
        System.out.println("Sắp xếp mảng vừa nhập:\n"+Arrays.toString(arr));
        
        //Tìm min
        double min = arr[0];
        for( int i = 1; i< arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phần tử nhỏ nhất là:"+min);
        
        //
        int dem = 0;
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 3 == 0) {
                tong += arr[i];
                dem++;
//            }
        }
        float tbc = tong / dem;
        System.out.printf("Trung bình cộng các số chia hết cho 3 là:%.1f",tbc);
    }  
    
}
