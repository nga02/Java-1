package Lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        float a,b,c,delta,x,x1,x2;//khai bao bien
        
        System.out.print("Nhập a:");
        a=Float.parseFloat(SC.nextLine());
        System.out.print("Nhập b:");
        b=Float.parseFloat(SC.nextLine());
        System.out.print("Nhập c:");
        c=Float.parseFloat(SC.nextLine());
        
        delta=(float) (Math.pow(b,2)-4*a*c);//tính delta
        
        if (a == 0) {//kiem tra he so
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                x=(-c/b);
                System.out.printf("Phương trình có một nghiệm kép x=%.1f",x);
            }
        }
        
        if(delta<0){//kiem tra đk delta
            System.out.println("Phương trình vô nghiệm!");
        }
        else if(delta==0){
            x=(-b/(2*a));
            System.out.printf("Phương trình có nghiệm x1=x2=x=%.1f",x);
        }
        else{
            x1=(float) ((-b+Math.sqrt(delta))/(2*a));
            x2=(float) ((-b-Math.sqrt(delta))/(2*a));
            System.out.printf("Phương trình có 2 nghiệm x1=%.1f ,x2=%.1f",x1,x2);
        }
    }
    
}
