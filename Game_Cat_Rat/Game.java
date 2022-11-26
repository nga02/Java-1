package Game_Cat_Rat;

public class Game {

    public static void main(String[] args) {
        Cat mew = new Cat("Tom", 15);
        Rat chuot = new Rat("Jerry", 15, 3);
        chuot.run();
        mew.run();
        System.out.println("Mèo bắt đầu đuổi chuột");
        mew.catchRat(chuot);
        System.out.println("Sau đó");
        mew.eatRat(chuot);
    }

}
