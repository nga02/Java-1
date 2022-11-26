package Slide5;

import java.util.ArrayList;
import java.util.Collections;

public class Bai2 {

    public static void main(String[] args) {
        // Khai báo ArrayList(list) lưu số thực
        ArrayList<Double> lstSoThuc = new ArrayList<>();
        //thêm 3 phần tử vào list
        lstSoThuc.add(6.0);
        lstSoThuc.add(Double.valueOf(6));
        lstSoThuc.add(9.4);

        //In số phần tử thứ 2
        System.out.println("Phần tử thứ 2 là:" + lstSoThuc.get(1));
        //In số phần tử của list
        System.out.println("Phần tử của list là:" + lstSoThuc.size());

         //Xuất list for i
        System.out.println("Duyệt for: ");
        for (int i = 0; i < lstSoThuc.size(); i++) {
            System.out.println(lstSoThuc.get(i));
        }
        //duyệt list for-each
        System.out.println("Xuất list for-each:");
        for (Double x : lstSoThuc) {
            System.out.println(x);
        }
        //
        System.out.println("Xuất list lamda");
        lstSoThuc.forEach((var x)->{
            System.out.println(x);
    });
        //sắp tăng
        Collections.sort(lstSoThuc);
        System.out.println("Xuất list for each sắp tăng:");
        for (Double x : lstSoThuc) {
            System.out.println(x);
        }

        //sắp giảm
        Collections.reverse(lstSoThuc);
        System.out.println("Xuất list for each sắp giảm:");
        for (Double x : lstSoThuc) {
            System.out.println(x);
        }
        
//        Sắp tăng dần
//        Collections.sort(lstSoThuc);
//        System.out.println("Xuất list Sắp tăng:"+lstSoThuc);
//        
//        Đảo ngược list để có sắp giảm
//        Collections.reverse(lstSoThuc);
//        System.out.println("Xuất list Sắp giảm:"+lstSoThuc);
    }

}
