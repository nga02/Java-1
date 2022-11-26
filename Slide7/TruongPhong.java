package Slide7;

import java.util.Scanner;

public class TruongPhong extends NhanVien {//Truong phong ke thua nhan vien
    //=> Truong phong dc su dung tai san (thuoc tinh, phuong thuc) của 
    //cha(NhanVien) nếu cha cho phép
    // cho phép: public , protected, default(nếu cung goi)
    //Khai báo thuoc tinh phuong thuc nhue binh thuong

    private double trachNhiem;
//Hàm tạo set,get,toString,nhap,inThongTin

    //Hàm tạo khoong kế thừa
    //Khi xây dung hàm tạo của lớp con có thể gọi đếm hàm tạo của cha
    public TruongPhong() {
//        super();//gọi hàm tạo khong tham so cua cha
//        trachNhiem=0;
    }
//Ham tao 3 tham so

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);// gọi hàm tạo 2 tham so cua cha
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
        //super.toString(): gọi đến toString của cha
        return super.toString() + "TruongPhong{" + "trachNhiem=" + trachNhiem + "}";
    }


//gõ nh ctr spcipe
    @Override// ghi đè phuong thuc
    public void nhap() {
        super.nhap(); // Gọi phuong thuc nhap cua cha de nhap họ tên,lương
        Scanner sc =new Scanner(System.in);
        System.out.println("Mời nhập trách nhiệm:");
        trachNhiem = Double.parseDouble(sc.nextLine());
    }
    // gõ in

    @Override
    public void inThongTin() {// nếu đề yêu cầu thì mới làm
//        super.inThongTin();// gọi den pthuc inThongTin cua cha de in họ tên, lương
//        System.out.println("Trách nhiệm:"+ trachNhiem);
        System.out.println(toString());
    }

}
//

