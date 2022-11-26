//SanPham: Masp, tenSP, donGia có phạm vi truy cập trong nội bộ lớp
//	Ham tao, set, get, toString
//	Nhap
//	Xuat
//
//QLSP:
//-	ArrayList<SanPham>
//-	Các phương thức như Ass ()
//+ Khởi tạo(): Thêm 3 phần tử vào list
//+ nhậpDSSP. Có hỏi tiếp tục
//+ xuấtDSSP.
//+ Sắp xếp theo DonGia Giảm dần.
//Demo: chứa main, dùng để tổ chức chương trình và gọi các phương thức đã xây dựng trong QLSP  giống Ass1
package Slide5;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLSPham {
     ArrayList<SPham> lstSPham = new ArrayList<>();
     public void khoiTao(){       
        lstSPham.add(new SPham("SP1","Sản Phẩm 1",12500));
        lstSPham.add(new SPham("SP2","Sản Phẩm 2",25300));
        lstSPham.add(new SPham("Sp3","Sản phẩm 3",43500));
    }
    //Nhập 
    public void nhapDSSP() {
        Scanner SC = new Scanner(System.in);
        while(true){
            SPham sp = new SPham();//tạo đối tượng cho sản phẩm
            sp.nhap();//nhập thông tin cho sản phẩm
            lstSPham.add(sp);//thêm sản phẩm vào list

            //Hỏi tiếp tục
            System.out.print("Bạn có muốn tiếp tục ko(Y/N): ");
            String traLoi = SC.nextLine();
            if (traLoi.equalsIgnoreCase("N")){//equalsIgnoreCase:so sánh không phân biệt hoa/thường
                break;
            }
        }      
    }
     public void xuatDSSP(){
        System.out.println("Xuất list");
//        System.out.println("MaSP \t\t Ten \t\t Gia ");//ko dùng toString thì mới phải thêm
        for (SPham x : lstSPham) {//for Ctrl+ cách chọn object
            x.xuat();
            //System.out.println("x");//dùng toString
        }        
    }
     //sắp
     public void sapTheoGia_Lambda() {
        lstSPham.sort((o1, o2) -> {
            Double g1 = o1.getGia();
            Double g2 = o2.getGia();
            return g2.compareTo(g1);//nếu muốn sắp giảm thì đổi chỗ d1, d2
        });
        //Xuất sau khi sắp xếp
        System.out.println("DSSV sắp theo giá:");
        xuatDSSP();
    }
     
}
