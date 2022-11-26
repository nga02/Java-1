package Slide2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        // Nhập tuổi và in tuổi
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
        boolean kq;
        //...
        //if(kq) <=> if(kq==true)
        //if(kq) <=> if(kq==false)
    }

}











//Việc chuyển từ nguyên thủy sang đối tượng(class Wrapper). Bao dống/hộp/Boxing/auto Boxing
//Đối tương (class Wrapper) => Nguyên thủy bao mở/mở hộp/unBoxing/autoBoxing
//Boxing
//Có 3 cách để bao giá trị nguyên thủy sau
//Integer a = Integer.valueOf(5) // bao tường minh
//Integer a = new Integer(5) // bao tường minh
//Integer a = 5 // bao ngầm định
//Unboxing
//Có 2 cách mở bao để lấy giá trị nguyên thủy sau
//int b = a.intValue() // mở bao tường minh
//int b = a; // mở bao ngầm định


// viết a+=b;


//Toán tử điều kiện là toán tử 3 ngôi duy nhất trong ngôn ngữ Java
//Cú pháp : <điều kiện> ? <giá trị đúng> : <giá trị sai>
