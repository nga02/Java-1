package assigment;

import java.util.Scanner;
import java.util.logging.Logger;

public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(String maNV, String hoTen, double luong, double trachNhiem) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public String toString() {
        return super.toString() + ",TruongPhong{" + "trachNhiem=" + trachNhiem + '}';
    }

    public double getthuNhap() {
        return super.getLuong() + this.trachNhiem;
    }


   
}
