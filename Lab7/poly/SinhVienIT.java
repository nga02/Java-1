
package Lab7.poly;

public class SinhVienIT extends SinhVien{
    //=> phải viết lại toàn bộ phương thức trừ tượng của cha
    //Khai bao thuộc tính, phương thức bình thường
    private double java,css;
// go get ctr sprice
//    @Override
//    public double getDiemTB() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    // bong den o dong 4
    @Override
    public double getDiemTB() {
        return (java + css)/2;
    }
    
    
}
