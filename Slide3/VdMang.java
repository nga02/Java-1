package Slide3;

import java.util.Arrays;
import java.util.Scanner;

public class VdMang {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int n;
        System.out.println("MỜi nhập số phần tử của mảng: ");
        n = Integer.parseInt(SC.nextLine());
        //Khai báo mảng số nguyên gồm n ptu
        int[] arr = new int[n];

        //nhập mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập ptử thứ %d: ", i + 1);
            arr[i] = Integer.parseInt(SC.nextLine());
        }

        //xuất mảng
        System.out.println("Xuất mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        //for each
        System.out.println("\nXuất mảng for each:");
        for (int x : arr) {
            System.out.print(x + "\t");
        }
        //NHớ import java.util.Arrays
        //sắp tăng
        Arrays.sort(arr);//import java.util.Arrays
        System.out.print("\nSắp xếp tăng: " + Arrays.toString(arr));
        //sắp giảm 
        // arr.sort(arr) khong thực hien đc sắp giảm
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.print("\nSắp xếp tăng: " + Arrays.toString(arr));
        
        //Tính tổng các phần tử của mảng
        int tong=0;
        
        for (int x : arr) {
            tong+=x;
        }
        System.out.printf("\nTổng:"+tong);        
        //Tính trung bình các ptu mang: khoogn cần dùng biến đếm ,chỉ dùng arr.length
        System.out.printf("\nTrung bình:%d",(tong/arr.length));
    }
}
