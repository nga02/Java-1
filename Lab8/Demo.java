
package Lab8;


public class Demo {

    public static void main(String[] args) {
        XHelper hp =new XHelper();
        System.out.println("Tổng 2 số: "+ hp.sum(4,5));
        System.out.println("Tổng 3 số: "+hp.sum(4,5,5));
        
        int a[]={5,4,6,3};
        System.out.println("Tổng các phần tử mảng:"+hp.sum(a));
    
        //hp.phuongThucStatic
        //Static
        //Ngoài cách gọi thông thường , ta còng có thể 
        //gọi trực tiếp TenLop.Ten_Thuộc _tính, TenLop.TenPhuongThuc() mà 
        //không cần tạo đối tượng
        System.out.println("\nStatic");
        XHelper.phuongThucStatic();
        System.out.println("Tổng 2 số: " + XHelper.tinhtong(3,5));
        System.out.println("Tổng 4 số: " + XHelper.tinhtong(3,4,6,5));
        
        
    }
    
}
