//1.	Tạo lớp Cat(name, weight (double), age(tuổi) có phạm vi truy cập trong nội bộ lớp
//-	Hàm tạo, set, get
//-	toString
//-	input(): nhập thông tin cho các thuộc tính
//-	String getStatus(int  age):
//age <1: young
//age<10: normal
//còn lại: old
//2.	Tạo lớp Test chứa main
//-	Tạo 2 đối tượng Cat, dùng hàm tạo có tham số, không tham số
//-	Xuất thông tin, yêu cầu xuất cả getStatus.
package Lab4;

public class Cat {

    private String name;
    private double weight;
    private int age;

    public Cat() {
    }

    public Cat(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", weight=" + weight + ", age=" + age + ",trang thai: " + getStatus() + '}';
    }

    public String getStatus() {

        if (age < 1) {
            return "young";
        } else if (age < 10) {
            return "normal";
        } else {
            return "old";
        }
    }
}

