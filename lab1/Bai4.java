package lab1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        double a,b,c,d,e;
        System.out.println("Bai4");
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = SC.nextDouble();
        System.out.println("Nhap b: ");
        b = SC.nextDouble();
        System.out.println("Nhap c: ");
        c = SC.nextDouble();
        d=(b*b)-(4*a*c);
        e=Math.sqrt(d);
        System.out.printf("Delta: " + d);
        System.out.printf("Căn delta: " + e);
    }
    
}
