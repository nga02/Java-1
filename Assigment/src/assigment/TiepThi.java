package assigment;

import java.util.logging.Logger;

public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hoaHong;

    public TiepThi(double doanhSo, double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi() {
    }

    public TiepThi(String maNV, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public Double getThuNhap() {
        return super.getLuong() + this.doanhSo + this.hoaHong;
    }

    @Override
    public String toString() {
        return super.toString() + ",TiepThi{"+ "doanhso=" + doanhSo + ",hoahong=" + hoaHong + "}";
    }
//    @Override
//    public void xuat() {
//        super.xuat();
//        System.out.println("Doanh số: " + this.doanhSo);
//        System.out.println("Hoa hong: " + this.hoaHong);
////        System.out.println(toString());
//    }

}
