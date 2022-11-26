package Lab8;

public class XHelper {

    static public int num;

    static {
        System.out.println("Khối static {} sẽ chạy trƣớc khi tạo đối tượng hoặc\n"
                + "truy xuất bất kỳ thành viên tĩnh khác");
    }

    public int sum(int... x) {
        int tong = 0;
        for (int i : x) {
            tong += i;
        }
        return tong;
    }

    static public int tinhtong(int... x) {
        int tong = 0;
        for (int i : x) {
            tong += i;
        }
        return tong;
    }

    static public void phuongThucStatic() {
        System.out.println("Tôi là phương thức Static");
    }
}
