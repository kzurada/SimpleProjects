package Java4easy1.animals;

public class Goat extends Animal implements Dairy {
    public Goat(double weight) {
        super(weight);
    }

    public int getMilk() {
        return 25;
    }

    public void talk() {
        System.out.println("Beeeeeeeeeeeeeeeeeeee!!!");
    }
}
