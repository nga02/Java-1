package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai {

    public static void main(String[] args) {
        // nhập mảng số nguyên từ bàn phím
        Scanner SC = new Scanner(System.in);
        int n, i;
        System.out.print("Mời nhập số phần tử của mảng:");
        n = Integer.parseInt(SC.nextLine());
        double mang[] = new double[n];
        //Nhập mảng
        for (i = 0; i < mang.length; i++) {
            System.out.printf("Mời nhập giá trị cho phần tử [%d]: ", i + 1);
            mang[i] = Double.parseDouble(SC.nextLine());
        }
        //Sắp xếp
        Arrays.sort(mang);
        System.out.printf("Sắp xếp mảng vừa nhập:\n" + Arrays.toString(mang));
        //Tìm min
        double min = mang[0];
        for (i = 0; i < n; i++) {
            if (min > mang[i]) {
                min = mang[i];
            }
        }
        System.out.printf("Phần tử nhỏ nhất là: %.1f\n", min);

        //Tính tbc các ptu chia hết cho 3;
        float dem = 0;
        int tong = 0;
        for (i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                tong += mang[i];
                dem++;
            }
        }
        float tbc = tong / dem;
        System.out.printf("Trung bình cộng các số chia hết cho 3 là:%.1f", tbc);
    }
}

