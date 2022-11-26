
package Lab4;

public class Bai4 {

    public static void main(String[] args) {
        sanpham sp1 = new sanpham("Áo",600,10);
        
        sp1.xuat();
        String ten = sp1.getTenSP();
        
        System.out.println("Ten sp:"+ten);
        sp1.setTenSP("Sản phẩm mới");
        sp1.xuat();
        
        
        
    }
    
}
