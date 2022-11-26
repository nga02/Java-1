package Lab3;

public class BaiThem5 {
   
    public static void main(String[] args) {
        
        //string [] ten = {"nimr";"niufiu","jfuif","fbvuh"}
        //        Bài 2: Khai báo 2 mảng chứa thông tin môn học:
        //-	Tên môn (String) 5 phần tử và gán giá trị
        //-	Giá tiền (double) 5 phần tử và gán giá trị 
        //-	Xuất thông tin 2 mảng: dùng 1 for, xuất theo cặp
        //-	Sắp mảng giảm dần theo Giá tiền (nhớ đổi chỗ cả tên môn)
        //-	Xuất thông tin Môn học sau khi sắp, xuất theo cặp
        //-	Xuất mảng tên môn dùng for-each
        //Nâng cao
        //Xây dựng chương trình con:
        //String getTrangThai (double gia):
        //Nếu gia<200: tuyệt vời
        //Nếu gia từ 200-1000: bình thường
        //Còn lại: quá đắt.
        //Bổ sung phần xuất mảng, xuất cả thông tin getTrangThai
        
        String[] ten = {"Mob", "Web", "CSDL", "Tin", "EN"};
        double[] gia = {100, 400, 300, 200, 500};
        //Xuất mảng
        System.out.print("Mảng vừa nhập là:\n");   
        for (int i = 0; i < ten.length; i++) {
            System.out.println(ten[i] + "\t" + gia[i]);
        }
        //-	Xuất mảng tên môn dùng for-each
        System.out.println("Xuất mảng for-each:");
         for(String string: ten)  {
             System.out.print(string+ "\t");
         }                
        //Sắp xếp giảm dần theo giá
        for (int i = 0; i < gia.length - 1; i++) {
            for (int j = i + 1; j < gia.length; j++) {
                if (gia[i] < gia[j]) {
                    double temp = gia[i];
                    gia[i] = gia[j];
                    gia[j] = temp;

                    String tentemp = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tentemp;
                }
            }
        }
        System.out.print("\nMảng sắp xếp giảm dần là:\n");
        for (int i = 0; i < ten.length; i++) {
            System.out.println(ten[i] + "\t" + gia[i]);
        }
    }
}
