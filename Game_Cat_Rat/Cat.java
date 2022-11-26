package Game_Cat_Rat;

public class Cat {

    String name;
    int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void run() {
        System.out.println("Mèo đang chạy với tốc độ " + speed);
    }

    boolean catchRat(Rat rat) {

        if (speed == rat.getSpeed()) {
            return true;
        } else {
            return false;
        }
    }

    public void eatRat(Rat food) {
        if (!catchRat(food)) {
            System.out.println("Meo meo,đói quá");
        } else {
            if (food.getWeight() <= 5) {
                System.out.println("Mum mum,chuột hơi gầy");
            } else {
                System.out.println("Mum mum,chuột ngon tuyệt");
            }
        }
    }
}
