package Java4easy1.animals;

public class Cow extends Animal implements Dairy {
    public Cow(double weight) {
        super(weight);
    }

    public int getMilk() {
        return 40;
    }

    public void talk() {
        System.out.println("Moooo!!!");
    }
}
