
package Slide5;

import java.util.ArrayList;

public class Bai1 {

    public static void main(String[] args) {
        //Khai báo ArrayList(list) không định kiêu => lưu kiểu bất kì
        //=> khi lấy rA PHẢI VỀ KIỂU GỐC    
        
        ArrayList lstK = new ArrayList();//Khai báo ArrayList(list) không định kiêu
        lstK.add(1);//thêm vào list 1 số nguyên
        lstK.add(5.5);//thêm vào list 1 số thực
        lstK.add("Chuỗi");//thêm vào list 1 chuõi
        lstK.add(true);//thêm vào list 1 giá trị boolean
        
        //=>Khi lấy ra phải ép về kiểu gốc
        Integer i =(Integer) lstK.get(0);
        System.out.println(i);
        String ch = (String) lstK.get(2); //lấy ra phần tử thứ 3
    }
    
}
