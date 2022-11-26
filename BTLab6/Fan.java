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

public class Fan {

    private String name;
    private String color;
    private double price;

    public Fan() {
    }

    public Fan(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        if (price < 500) {
            return "tot";
        } else {
            return "binh thuong";
        }
    }

    @Override
    public String toString() {
        return "Fan{" + "name=" + name + ", color=" + color + ", price=" + price + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sp:");
        name = sc.nextLine();

        System.out.println("Nhap mau sac:");
        color = sc.nextLine();

        System.out.println("Nhap gia:");
        price = Double.parseDouble(sc.nextLine());

    }

    public void xuat() {
        System.out.println(name + "\t" + color + "\t" + price+"\t" + getStatus());
    }

}
