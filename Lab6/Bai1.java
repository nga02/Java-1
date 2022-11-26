
package Lab6;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoVaTen;
        System.out.println("Nhap ho va ten: ");
        hoVaTen = sc.nextLine();
        
        System.out.println("\nHọ tên vừa nhập:" + hoVaTen);
        System.out.println("In hoa:" + hoVaTen.toUpperCase());
        
        int vtd = hoVaTen.indexOf(" "); 
        String ho = hoVaTen.substring(0, vtd);
        
        int vtc = hoVaTen.lastIndexOf(" ");     
        String tenDem = hoVaTen.substring(vtd + 1, vtc);
        
        String ten = hoVaTen.substring(vtc + 1);
        System.out.println("\nHọ: " + ho);
        System.out.println("Đệm: " + tenDem);
        System.out.println("Tên: " + ten);
    }
    
}
