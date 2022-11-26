
package Lab6;

import java.util.Scanner;

public class SinhVien {
    public String hoTen,email,sdt,cmnd;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", email=" + email + ", sdt=" + sdt + ", cmnd=" + cmnd + '}';
    }
   public void nhap(){
       System.out.println("Nhap:");
       Scanner sc = new Scanner(System.in);
       do {
            System.out.print("Nhap ho ten: ");
            hoTen = sc.nextLine();
            if (hoTen == null | hoTen.equals("")) {
                System.out.println("Ho ten khong hop le.Vui lòng nhâp lai!");
            } else {
                break;
            }
        } while (true);
        Data d = new Data();
       do{
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (d.isEmail(email)) {
                break;
            }
            System.out.println("Email khong hop le!");
       }while(true);
       do {
            System.out.print("Nhap so dien thoai: ");
            sdt = sc.nextLine();
            if (d.isPhone(sdt)) {
                break;
            }
            System.out.println("SDT khong hop le!");
        } while (true);

        do {
            System.out.print("Nhap so CMND: ");
            cmnd = sc.nextLine();

            if (d.isCMND(cmnd)) {
                break;
            }
            System.out.println("CMND khong hop le!");
        } while (true);
   }
   public void xuat(){
       System.out.printf("Ho ten: %s\nSDT: %s\nEmail:%s\nCMND:%s",hoTen,sdt,email,cmnd);
   }
    
}
