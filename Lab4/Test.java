package Lab4;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Cat cat1 = new Cat();
            Cat cat2 = new Cat("meo", 45, 20);
            System.out.println("Nhập tên :");
            cat1.setName(sc.nextLine());
            System.out.println("Nhập tuổi :");
            cat1.setAge(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập cân nặng :");
            cat1.setWeight(Double.parseDouble(sc.nextLine()));

            System.out.println(cat1.toString());
            System.out.println(cat2.toString());
        }

}










