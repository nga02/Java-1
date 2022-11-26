package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng sinh viên:");
        n = Integer.parseInt(SC.nextLine());
        String Name[] = new String[n];
        double Diem[] = new double[n];
        //Nhập mảng
        for (int i = 0; i < Name.length; i++) {
            System.out.printf("Nhập tên sv thứ [%d]:", i + 1);//sout
            Name[i] = SC.nextLine();
            System.out.printf("Nhập điểm của sv thứ [%d]:", i + 1);
            Diem[i] = Double.parseDouble(SC.nextLine());
        }
        System.out.println("Mảng sinh viên là: " + Arrays.toString(Name));
        System.out.println("Mảng điểm sinh viên là: " + Arrays.toString(Diem));
        //for each : fore---tab
        //Xuất mảng
        for (int i = 0; i < Name.length; i++) {
            System.out.println("Họ tên: " + Name[i]);
            System.out.println("Điểm: " + Diem[i]);
            
            if (Diem[i] >= 9) {
                System.out.println("Học lực xuất sắc!");
            } else if (Diem[i] >= 7.5) {
                System.out.println("Học lực gỏi! ");
            } else if (Diem[i] >= 6.5) {
                System.out.println("Học lực khá! ");
            } else if (Diem[i] >= 5) {
                System.out.println("Học lực trung bình! ");
            } else {
                System.out.println("Học lực yếu! ");
            }

            
            System.out.println("");
        }
        //Sắp xếp
        
        for (int i = 0; i < Diem.length-1; i++) {
            for (int j = i + 1; j < Diem.length; j++) {
                if (Diem[i] < Diem[j]) {
                    double temp = Diem[j];
                    Diem[i] = Diem[j];
                    Diem[j] = temp;
                    String svTemp = Name[i];
                   Name[i] = Name[j];
                    Name[j] = svTemp;
                }
            }
        }
        System.out.println("Sắp xếp điểm theo thứ tự giảm dần:");
        for (int i = 0; i < Name.length; i++) {
            System.out.printf("Họ tên: %s" ,Name[i]);
            System.out.printf("Điểm: %.1f" ,Diem[i]);
            System.out.println("");
        }
    }
}
