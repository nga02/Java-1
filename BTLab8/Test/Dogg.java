
package BTLab8.Test;

import java.util.Scanner;

public class Dogg {
     private String name,color;
    private double age;

    public Dogg() {
    }

    public Dogg(String name, String color, double age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", color=" + color + ", age=" + age + '}';
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap name:");
        name = sc.nextLine();       
        System.out.println("Nhap mau ssac:");
        color = sc.nextLine();
        System.out.println("Nhập tuổi:");
        age = Double.parseDouble(sc.nextLine());
        
    }
    public void inThongTin(){
        System.out.println(toString());
    }
}
