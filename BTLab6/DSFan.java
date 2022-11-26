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

import java.util.ArrayList;
import java.util.Scanner;

public class DSFan {

    private ArrayList<Fan> list = new ArrayList<>();

    public void khoiTao() {
        list.add(new Fan("sp1", "red", 120));
        list.add(new Fan("sp2", "blue", 420));
        list.add(new Fan("sp3", "pink", 510));
        list.add(new Fan("sp4", "black", 520));
        
    }
    public void nhapDSFan() {
        Scanner SC = new Scanner(System.in);
        while(true){
            Fan p = new Fan();
            p.nhap();
            list.add(p);
            
            System.out.print("Bạn có muốn tiếp tục ko(Y/N): ");
            String traLoi = SC.nextLine();
            if (traLoi.equalsIgnoreCase("N")){
                break;
            }
        }
    }
    public void xuat(){
        System.out.println("Xuat thong tin sp");
        for (Fan fan : list) {
            fan.xuat();
        }
    }
    public void findFan() {
        System.out.println("--------------------------------");
        System.out.println("Danh sach san pham");
        for (Fan sp : list) {            
            if(sp.getColor().equalsIgnoreCase("blue")){
                sp.xuat();
                System.out.println("");
            } else {
            }
        }
    }
    public void sapTheoPrice_Lambda() {
        list.sort((o1, o2) -> {
            Double d1 = o1.getPrice();
            Double d2 = o2.getPrice();
            return d2.compareTo(d1);
        });
        //Xuất sau khi sắp xếp
        System.out.println("DSSV sắp theo price giam dan:");
        xuat();
    }
   
}
