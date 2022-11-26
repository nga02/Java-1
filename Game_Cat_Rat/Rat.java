package Game_Cat_Rat;

public class Rat {

    private String name;
    private int speed, weight;

    public Rat(String name, int speed, int weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("Chuột đang chạy với tốc độ " + speed);
    }
}
