package BTLab8.Test;

import java.util.Scanner;
import java.util.logging.Logger;

public class LittleDOg extends Dogg{
    private double weight;

    public LittleDOg(double weight) {
        this.weight = weight;
    }

    public LittleDOg(String name, String color, double age,double weight) {
        super(name, color, age);
        this.weight = weight;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng:");
        weight = Double.parseDouble(sc.nextLine());
    }
   @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Cân nặng:"+weight);
    }
}
