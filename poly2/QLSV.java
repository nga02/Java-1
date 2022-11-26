package poly2;

import Slide4.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {

    //Khai báo ArrayList (list) chứa SinhVien
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> lstSinhVien = new ArrayList<>();

    // Xây dựng các phương thức như ass yêu cầu
//Y1.Nhập danh sách nhân viên từ bàn phím
    public void khoiTao() {
        lstSinhVien.add(new SinhVien("Hoa", 8));
        lstSinhVien.add(new SinhVien("Mai", 9));
        lstSinhVien.add(new SinhVien("Minh", 7));
    }

    public void nhapDSSV() {

        while (true) {
            SinhVien sv = new SinhVien();//tạo đối tượng sinh viên
            sv.nhap();//nhập thông tin cho sinh vien
            lstSinhVien.add(sv);//thêm sinh viên vào list

            //Hỏi tiếp tục
            System.out.print("Bạn có muốn tiếp tục ko(Y/N): ");
            String traLoi = sc.nextLine();
            if (traLoi.equalsIgnoreCase("N")) {//equalsIgnoreCase:so sánh không phân biệt hoa/thường
                break;
            }
        }
    }
//Y2.Xuất danh sách sinh viên ra màn hình

    public void xuatDSSV() {//duyệt list <=> xuất danh sách sinh viên
        System.out.println("Xuất list");
        System.out.println("Họ tên \t Điểm ");//ko dùng toString thì mới phải thêm
        for (SinhVien x : lstSinhVien) {//for Ctrl+ cách chọn object
            x.xuat();
            //System.out.println("x");//dùng toString
        }
    }
//Y7.Sắp xếp  nhân viên theo họ tên

    public void sapTheoHoTen() {
        //nhớ import java.util.Comparator;
        //Tạo đối tượng Comparator để định nghĩa tiêu chí so sánh giữa 2 SinhVien
        //là so sánh theo họ tên
        Comparator<SinhVien> com = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());//giảm: đổi chỗ o1,o2
            }
        };
        Collections.sort(lstSinhVien, com);//import java.util.Collections;

        // Xuất
        System.out.println("\nSau khi sắp tăng:");
        xuatDSSV();
    }

    public void sapTheoHoTen_Lamda() {
        lstSinhVien.sort((o1, o2) -> {
            return o2.getHoTen().compareTo(o1.getHoTen());
        });
        System.out.println("\nSau khi sắp giảm:");
        xuatDSSV();

    }
//Y8. Sắp xếp sinh viên theo điểm  

    public void sapTheoDiem() {
        //Tạo Comparator để định nghĩa việc so sánh giữa 2sv
        //là so sánh theo điểm
        Comparator<SinhVien> com = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                //lấy điểm o1,o2=> chuyển về Double
                Double d1 = o1.getDiem();
                Double d2 = o2.getDiem();
                return d1.compareTo(d2);//nếu muốn sắp giảm thì đổi chỗ d1, d2
            }
        };
        //Thực hiện sắp xếp
        Collections.sort(lstSinhVien, com);
        //Xuất sau khi sắp xếp
        System.out.println("DSSV sắp theo điểm:");
        xuatDSSV();
    }

    //Y7.Sắp xếp theo họ tên dùng lamda
    public void sapTheoDiem_Lambda() {
        lstSinhVien.sort((o1, o2) -> {
            Double d1 = o1.getDiem();
            Double d2 = o2.getDiem();
            return d1.compareTo(d2);//nếu muốn sắp giảm thì đổi chỗ d1, d2
        });
        //Xuất sau khi sắp xếp
        System.out.println("DSSV sắp theo điểm:");
        xuatDSSV();
    }
//Y6.Tìm nhân viên theo khboangr lương nhập từ bàn phím

    public void timTheoKhoangDiem() {

        double min, max;
        System.out.println("Nhập min:");
        min = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập max:");
        max = Double.parseDouble(sc.nextLine());

        System.out.println("DSSV có điểm tử min đên max là:");
        System.out.println("Họ tên \t Điểm");
        for (SinhVien x : lstSinhVien) {
            if (x.getDiem() >= min & x.getDiem() <= max) {
                x.xuat();
            }
        }
    }

//Y3.TÌm và hiển thị nhân viên theo mã nhập từ bàn phím
    public void timTheoHoTen() {
        Scanner sc = new Scanner(System.in);
        String hoTenCanTim;
        System.out.println("Mời nhập họ tên cần tìm:");
        hoTenCanTim = sc.nextLine();

        boolean kq = false;
        System.out.println("DSSV tìm được là:");
        System.out.println("Họ tên: \t Điểm:");
        for (SinhVien x : lstSinhVien) {
            if (x.getHoTen().equalsIgnoreCase(hoTenCanTim)) {
                x.xuat();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Không có sinh viên nào!");
        }
    }
}
