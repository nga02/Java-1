
//Lớp Fan: 
//-	đầy đủ thuộc tính: name, color, price
//-	Hàm tạo, set, get, toString
//-	void input(): nhập thông tin cho các thuộc tính
//-	void output(): xuất thông tin, xuất cả trạng thái (status)
//-	String getStatus(): nếu price <500 thì status là tốt, còn lai: bình thường.
//Lớp DSFan:
//-	1 ArrayList <Fan>
//-	void init(): thêm 4 phần tử vào list
//-	void inputDSFan():Nhập Danh sách Fan. Có hỏi tiếp tục.
//-	void outputFan(): xuất thông tin các phần tử, xuất cả trạng thái
//-	void findFan(): In thông tin các Fan có màu “blue”
//-	void sortFan(): sắp xếp các Fan theo price giảm dần.
//Lớp Demo (giống Ass1): chứa main
//-	Dùng while(true), switch tổ chức chương trình
//-	Tạo đối tượng DSFan: ds
//-	Gọi các phương thức vừa tạo của ds 
package BTLab6;

import java.util.Scanner;


public class Demo {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int chon;
        DSFan ds = new DSFan();
        while(true){
            menu();
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    System.out.println("1.Ban chon nhap DS Fan");
                    ds.nhapDSFan();
                    break;
                case 2:
                    System.out.println("2.Xuat DS Fan");
                    ds.xuat();
                    break; 
                case 3:
                    System.out.println("3.Khoi tao");
                    ds.khoiTao();
                    System.out.println("Danh sach sau khi khoi tao");
                    ds.xuat();
                    break;
                case 4:
                    System.out.println("Thong tin sp co mau blue");
                    ds.findFan();
                    break;
                case 5:
                    System.out.println("Sawps xeeps giam dan:");
                    ds.sapTheoPrice_Lambda();
                    break;   
            }
        }
    }
    public static void menu(){
        System.out.println("----------Munu--------------");
        System.out.println("1.Nhap thoong tin              ");
        System.out.println("2.Xuat thong tin cac phan tu   ");
        System.out.println("3.Khoi tao                     ");
        System.out.println("4.Thong tin san pham co mau blue");
        System.out.println("5.Sap xep price theo gia tri giam dan");
        System.out.println("Moi ban chon :             ");
    }
}
