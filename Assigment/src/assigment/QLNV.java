package assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLNV {

    ArrayList<NhanVien> lstNhanVien = new ArrayList<>();

//Y1. Nhập danh sách nhân viên từ bàn phím. 
    public void khoiTao() {
//    Thêm 5 p.tử vào list
        lstNhanVien.add(new NhanVien("ph123", "Le Hoa", 900));
        lstNhanVien.add(new NhanVien("ph234", "Ha Mai", 1200));
        lstNhanVien.add(new NhanVien("ph423", "Ngoc Hà", 800));
        lstNhanVien.add(new NhanVien("ph531", "Quy Minh", 1500));
        lstNhanVien.add(new NhanVien("ph273", "Le Nam", 500));
    }

    public void keThua() {
        TruongPhong tp = new TruongPhong("ph2567", "Ha Anh", 1800, 24);
        System.out.println(tp);
        TiepThi tt = new TiepThi("ph467", "Hoang Hoa Tham", 850, 125, 25);
        System.out.println(tt);
    }

    public void nhapDSNV() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời nhập thông tin sinh viên");

            System.out.println("Mã nhân viên: ");
            String maNV = sc.nextLine();
            System.out.println("Họ tên nhân viên: ");
            String hoTen = sc.nextLine();
            System.out.println("Lương nhân viên: ");
            Double luong = Double.parseDouble(sc.nextLine());

            System.out.println("Chức vự: \t 1.Trưởng phòng: \t 2.Nhân viên: ");
            int cv = Integer.parseInt(sc.nextLine());
            if (cv == 1) {
                System.out.println("Trách nhiệm: ");
                Double trachNhiem = Double.parseDouble(sc.nextLine());
                NhanVien nv = new TruongPhong(maNV, hoTen, luong, trachNhiem);
                lstNhanVien.add(nv);
            } else {
                System.out.println("Doanh số: ");
                Double doanhSo = Double.parseDouble(sc.nextLine());
                System.out.println("Hoa hồng: ");
                Double hoaHong = Double.parseDouble(sc.nextLine());
                NhanVien nv = new TiepThi(maNV, hoTen, luong, doanhSo, hoaHong);
                lstNhanVien.add(nv);
            }
            System.out.println("Ban co muon tiep tuc ko(Y/N):");
            String traloi = sc.nextLine();
            if (traloi.equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("\n");
    }
//Y2. Xuất danh sách nhân viên ra màn hình.    

    public void xuatDSNV() {
        System.out.println("Danh sach nhan vien");
        for (NhanVien x : lstNhanVien) {
            x.xuat();
        }
        System.out.println("\n");
    }
//Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.

    public void timTheoMaNV() {
        Scanner sc = new Scanner(System.in);
        String maCanTim;
        System.out.println("Tim theo ma nhan vien");
        maCanTim = sc.nextLine();

        boolean kq = false;
        System.out.println("DSNV tim dc theo ma" + maCanTim + "la:");
        System.out.println("manv: \t tennv: \t luong: ");
        for (NhanVien nv : lstNhanVien) {
            if (nv.getMaNV().equalsIgnoreCase(maCanTim)) {
                nv.xuat();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong co manv trung khop!");
        }
    }
//Y4. Xóa nhân viên theo mã nhập từ bàn phím.

    public void xoaTheoMaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên cần xóa: ");
        String maCanXoa = sc.nextLine();
        boolean kt = false;

        for (NhanVien nv : lstNhanVien) {
            if (nv.getMaNV().equals(maCanXoa)) {
                lstNhanVien.remove(nv);
                kt = true;
                System.out.println("Xoa nv thanh cong!");
                break;

            }
        }
        if (!kt) {
            System.out.println("Không có mã nhân viên: " + maCanXoa);
        }
    }
//Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím

    public void capNhatTheoMa() {
        Scanner sc = new Scanner(System.in);
        String ma;
        System.out.println("Mời nhập mã nhân viên cần tìm: ");
        ma = sc.nextLine();
        boolean kq = false;
        for (int i = 0; i < lstNhanVien.size(); i++) {
            NhanVien nv = lstNhanVien.get(i);
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                System.out.print("Mời nhập thông tin cập nhật: ");
                System.out.print("Mời nhập tên mới: ");
                String tenMoi = sc.nextLine();
                System.out.println("Mời nhập mức lương mới: ");
                double donGiaMoi = Double.parseDouble(sc.nextLine());
                lstNhanVien.set(i, new NhanVien(ma, tenMoi, donGiaMoi));

                System.out.println("Đã cập nhật xong!");
                kq = true;
                break;
            }
        }
        if (!kq) {
            System.out.println("Không có sản phẩm nào có mã là: " + ma);
            System.out.println("");
        }
    }
//Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.

    public void timTheoKhoangLuong() {
        Scanner sc = new Scanner(System.in);
        double min, max;
        System.out.println("Nhập min:");
        min = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập max:");
        max = Double.parseDouble(sc.nextLine());

        System.out.println("DSNV cos luong tử min đên max là:");
        System.out.println("Họ tên \t Điểm");
        for (NhanVien x : lstNhanVien) {
            if (x.getLuong() >= min & x.getLuong() <= max) {
                x.xuat();
            }
        }
    }
//Y7. Sắp xếp nhân viên theo họ và tên.

    public void xepTheoHoTen() {
        Comparator<NhanVien> com = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());// sap tang
            }
        };
        Collections.sort(lstNhanVien, com);

        System.out.println("Sap theo ho ten:");
        xuatDSNV();
    }
//Y8. Sắp xếp nhân viên theo thu nhập.

    public void xepTheoThuNhap() {
        Comparator<NhanVien> com = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                Double d1 = o1.getLuong();
                Double d2 = o2.getLuong();
                return d2.compareTo(d1);
            }
        };
        Collections.sort(lstNhanVien, com);

        System.out.println("Sap theo luong giam dan:");
        xuatDSNV();
    }
//Y9. Xuất 5 nhân viên có thu nhập cao nhất.

    public void namNhanVienTNCN() {
        Collections.sort(lstNhanVien, (a, b) -> (int) (b.getLuong() - a.getLuong()));
        System.out.println(" danh sách có thu nhập cao nhất: ");
        for (int i = 0; i < 5 && i < lstNhanVien.size(); i++) {
            lstNhanVien.get(i).xuat();
        }
    }
}
