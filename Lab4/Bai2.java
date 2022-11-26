
package Lab4;

public class Bai2 {
    public static void main(String[] args) {
        sanpham sp0[] = new sanpham[2];
         for (int i = 0; i < sp0.length; i++) {
          sanpham sp = new sanpham();
          sp.nhap();
          sp0[i] = sp;
        }
//         xuất
      for(sanpham sp:sp0){
         sp.xuat();
        //Tạo đối tượng SanPham sp1,sp2
        
       }
    }
}
