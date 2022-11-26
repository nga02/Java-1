package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSP {

    private ArrayList<SanPham> list = new ArrayList<>();

    public void nhap() {
         Scanner sc = new Scanner(System.in);      
        System.out.println("Nhap danh sach san pham");
        int i = 0;
        do {          
            System.out.printf("Nhap ten SP thu %d: ", i);
            String ten = sc.nextLine();
            
            if (ten == null || ten.equals("")) {
                break;
            }
            System.out.print("Gia san pham: ");
            double gia = sc.nextDouble();
            
            list.add(new SanPham(ten, gia));
            sc.nextLine();
            i++;
        }while (true);
    }
    
    public void hienThi() {
        System.out.println("Danh sach san pham");
        System.out.println("Ten\t\t;Gia\t\t");
        for (SanPham sp : list) {
            System.out.printf("%s | %.2f \n", sp.getTenSP(), sp.getGia());
        }
    }

    public void sapXep() {
        Collections.sort(list, (a,b) -> (int) (a.getGia() - b.getGia()));
        System.out.println("Danh sách sau khi sắp xếp:");
        hienThi();
    }

    public void timVaXoa() {
         Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham can tim: ");
        String ten = sc.nextLine();

        SanPham found = null;

        for (SanPham sp1 : list) {
            if (sp1.getTenSP().equals(ten)) {
                found = sp1;
                break;
            }
        }
        if (found != null) {
            list.remove(found);
            System.out.println("Da xoa san pham khoi danh sach");
        }else {
            System.out.println("Khong tim thay san pham");
        }
    }

    public void tinhGiaTB() {
        double avg = 0, sum = 0;
        for (SanPham sp : list) {
            sum += sp.getGia();
        }
        avg = sum / list.size();
        System.out.println("Gia trung binh la: " + avg);
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Sap xep san pham theo gia");
            System.out.println("4. Tim va xoa  san pham");
            System.out.println("5. Tinh gia trung binh");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            chon = s.nextInt();
            if (chon != 0) {
                switch (chon) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        hienThi();
                        break;
                    case 3:
                        sapXep();
                        break;
                    case 4:
                        timVaXoa();
                        break;
                    case 5:
                        tinhGiaTB();
                        break;
                    default:
                        System.out.println("Nhap sai, nhap lai!");
                }
            }

        } while (true);
    }
}
