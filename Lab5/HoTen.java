package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HoTen {

    private ArrayList<String> list = new ArrayList<>();

    public void nhap() {
        list.clear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap danh sach ho ten");
        while (true) {
            System.out.print("Nhap ho ten: ");
            String ten = scanner.nextLine();
            if (ten.isEmpty()) {
                System.out.println("Nhap du lieu thanh cong!");
                break;
            }
            list.add(ten);
        }
    }

    public void xuat() {
        System.out.println("Danh sách họ tên:");
        for (String item : list) {
            System.out.println("Họ tên: " + item);
        }
    }

    public void xuatNgauNhien() {
        Collections.shuffle(list);
        xuat();
    }

    public void sapXep() {
        Collections.sort(list, (a, b) -> a.compareTo(b));
//        Collections.reverse(list);
        xuat();

    }

    public void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten muon xoa: ");
        String hoTen = scanner.nextLine();

        for (String item : list) {
            if (item.equalsIgnoreCase(hoTen)) {
                list.remove(item);
                System.out.println("Xoa ho ten thanh cong!");
                break;
            }

        }
    }

    public void hienThiMenu() {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Nhap danh sach ho ten");
            System.out.println("2. Hien thi danh sach ho ten");
            System.out.println("3. Sap xep ngau nhien");
            System.out.println("4. Sap xep");
            System.out.println("5. Xoa");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatNgauNhien();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoa();
                    break;
                default:
                    System.out.println("Nhap sai, nhap lai");
            }
        } while (true);
    }
}
