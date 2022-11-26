package BTLab8;

public class XPoly {

    //Bai1
    public static double sum(double... x) {
        double s = 0;
        for (double a : x) {
            s += a;
        }
        return s;
    }

    //Bai2
    public static double min(double... x) {
        double m = x[0];
        for (double a : x) {
            m = Math.min(m, a);
        }
        return m;
    }

    public static double max(double... x) {
        double mx = x[0];
        for (double a : x) {
            mx = Math.max(mx, a);
        }
        return mx;
    }

    //Bai3
    public static String toUpperFirstCha(String name) {
        String[] ars = name.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ars.length; i++) {
            String a = ars[i];
            if (!a.equals("")) {
                String ch = a.substring(0, 1).toUpperCase();
                a = ch + a.substring(1).toLowerCase();
                sb.append(a).append(" ");
            }
        }
        return sb.toString().trim();// chuyeenr ddoi tuong sb thanh chuoi va xoa ki tu trang 2 dau cua chuoi
    }

    public static void main(String[] args) {
        String name = "le thi nga";
        String newName = toUpperFirstCha(name);
        System.out.println("New Name: " + newName);

        double se = sum(2);
        System.out.println("Tổng: " + se);

        se = sum(3, 5, 4, 8);
        System.out.println("Tổng: " + se);

        double m = min(2);
        System.out.println("Min: " + m);

        m = min(3.5, 5, 4, 8.9);
        System.out.println("Gtri nho nhat trong day: " + m);

        double mx = max(2);
        System.out.println("Max: " + mx);

        mx = max(3, 5, 4, 9.6);
        System.out.println("Gtri lon nhat trong day la: " + mx);
    }

}
