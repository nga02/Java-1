package BTLab8.Test;
//File => Close All Projects. Tạo dự án: Test_MSSV. KHÔNG SỬ DỤNG TÀI LIỆU.
//1)	Tạo Class Dog bao gồm các thuộc tính: name, age, color,  – inThongTin():void - (Đối với class Private các thuộc tính, Getter & Setter, Contructor có tham số và không tham số) 

import BTLab8.Test.Dogg;
import BTLab8.Test.LittleDOg;
import BTLab8.Test.QL_Dog;
import java.util.Scanner;

//2)	Tạo Class QLDog sử dụng (List) Hoặc ArrayList< Dog >, code các chức năng tại đây như (ví dụ:  nhập danh sách, xuất danh sách, xóa, tìm kiếm…..) 
//3)	Tạo Class Main Tạo Menu sử dụng SwitchCase  và gán các chức năng bên Class QLDog sang.
//Viết chương trình thực hiện việc quản lý như menu sau (Switch Case – Loop): 
//		Khởi tạo: thêm 4 phần tử vào list
//		1.Nhập 1 đối tượng hoặc danh sách đối tượng  
//		Khi nhập có hỏi tiếp hay ko? 
//		2.Xuất 1 đối tượng hoặc danh sách đối tượng 
//              3. in thông tin các con chó có màu “yellow”
//		4. sắp các phần tử giảm dần theo age 
//		5. in thông tin các phần tử có age lớn nhất.
//		0.Thoát 
//4)	Tạo lớp LittleDog kế thừa từ Dog thêm thuộc tính: weight – double, – Kế thừa phương thức inThongTin ():void của lớp cha (Đối với class con Private các thuộc tính, Getter & Setter, Contructor có tham số và không tham số).
//5)	Bổ sung vào menu chức năng Kế thừa, khi lựa chọn chức năng Kế thừa khởi tạo 1 đối tượng lớp LittleDog có giá trị ban đầu bằng Contructor có tham số sau đó in thông tin đối tượng đó ra màn hình bằng phương thức inThongTin ():void 
//6)	Trong bài thi có dùng Phương thức có trả về giá trị
public class Test_PH26840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QL_Dog ds = new QL_Dog();
        while (true) {
        menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("1.Ban chon nhap DSDog");
                    ds.nhapDSDog();
                    break;
                case 2:
                    System.out.println("2.Xuat DSDog");
                    ds.inDSDog();
                    break;
                case 3:
                    System.out.println("3.Khoi tao");
                    ds.khoiTao();
                    System.out.println("Danh sach sau khi khoi tao");
                    ds.inDSDog();
                    break;

                case 4:
                    System.out.println("4.Thong tin con cho co mau yellow");
                    ds.inColor();
                    break;
                case 5:
                    System.out.println("5.sắp xếp theo tuổi giảm dần");
                    ds.sapTheoAge_Lambda();
                    break;
                case 6:
                    System.out.println("Kế thừa");
                    Dogg dg = new LittleDOg("com9", "red", 9, 10);
                    dg.inThongTin();
                    break;
                case 7: 
                    System.out.println("Thông tin con co tuoi max");
                    ds.tuoiMax();
                case 0:
                    break;
                default:
                    System.out.println("Nhaapoj không dúng,nhap lai!");
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("----------------menu----------------");
        System.out.println("1.Nhập danh sách Dog");
        System.out.println("2.Xuất ds dog");
        System.out.println("3.Khởi tạo");
        System.out.println("4.Thông tin con cho mau yellow");
        System.out.println("5.Sắp xếp theo tuổi giảm dần");
        System.out.println("6.Kế thừa");
        System.out.println("7.Thông tin con co tuoi max");
         System.out.println("------------------------------------");
        System.out.println("Moi ban chon chuc năng:");
       
        System.out.println("");
    }
}
