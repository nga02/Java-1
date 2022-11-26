package Slide6;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        // Nhập email đúng định dạng
        Scanner sc = new Scanner(System.in);
        String email, mauEmail = "\\w+@\\w+(\\.\\w+){1,2}";

        while (true) {
            System.out.println("Mời nhập Email:");
            email = sc.nextLine();

            if (email.matches(mauEmail)) {
                System.out.println("Email đúng định dạng");
                break;
            } else {
                System.out.println("Email nhập sai định dạng");
            }
        }
        System.out.println("\nEmail vừa nhập là:" + email);
    }
}
