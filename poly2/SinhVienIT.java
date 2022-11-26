
package poly2;

public class SinhVienIT extends SinhVien{
    private int tuoi;

    public SinhVienIT() {
    }

    public SinhVienIT(int tuoi) {
        this.tuoi = tuoi;
    }

    public SinhVienIT(String hoTen, double diem,int tuoi) {
        super(hoTen, diem);
        this.tuoi = tuoi;
    }
    @Override
    public String toString() {
        return super.toString()+ "SinhVienIT"+"tuoi="+tuoi+"}";
    }
}
