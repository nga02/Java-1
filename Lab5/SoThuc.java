
package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class SoThuc {
    //định nghĩa phương thức nhập
    private ArrayList<Double> listST = new ArrayList<>();
    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap danh sach so thuc");
        while (true) {
            System.out.print("Nhap so: ");
            double x = scanner.nextDouble();
            listST.add(x);
            scanner.nextLine();
            System.out.print("Bạn có muốn nhập tiếp du lieu (Y/N): ");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }
    public void hienThi() {
        System.out.println("------------------------------");
        for (Double item : listST) {
            System.out.print("   " + item);
        }
        System.out.println();
    }

    public void tinhTong() {
        double tong = 0;
        for (Double item : listST) {
            tong += item;
        }
        System.out.println();
        System.out.println("Tong: " + tong);
    }
}
