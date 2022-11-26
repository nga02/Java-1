
package BTLab8.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class QL_Dog {
      private ArrayList<Dogg> lst = new ArrayList<>();

    public void khoiTao(){
       lst.add(new Dogg("con1", "red", 5));
       lst.add(new Dogg("con2", "yellow", 10));
       lst.add(new Dogg("con3", "black", 6));
       lst.add(new Dogg("con4", "blue", 8));
        
    }
    public void nhapDSDog() {

        Scanner SC = new Scanner(System.in);
        while (true) {
            Dogg dg = new Dogg();
            dg.nhap();
            lst.add(dg);

            System.out.print("Bạn có muốn tiếp tục ko(Y/N): ");
            String traLoi = SC.nextLine();
            if (traLoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    public void inDSDog(){
        for (Dogg x : lst) {           
            x.inThongTin();
        }
    }
     public void inColor() {
        System.out.println("--------------------------------");
        System.out.println("Danh sach con cho");
        for (Dogg x : lst) {            
            if(x.getColor().equalsIgnoreCase("yellow")){
                x.inThongTin();
               
            } else {
               
            }
        }
    }
    public void sapTheoAge_Lambda() {
        lst.sort((o1, o2) -> {
            Double d1 = o1.getAge();
            Double d2 = o2.getAge();
            return d2.compareTo(d1);
        });
        //Xuất sau khi sắp xếp
        System.out.println("DSSV sắp theo price giam dan:");
        inDSDog();
    }
   //5. in thông tin các phần tử có age lớn nhất.
    public void tuoiMax(){
        lst.sort((o1, o2) -> {
            Double d1 = o1.getAge();
            Double d2 = o2.getAge();
            return d2.compareTo(d1);
        });
        for (Dogg dog : lst) {
            
            if(dog.getAge()==lst.get(0).getAge()){
                dog.inThongTin();
            }
        }
    }
}
