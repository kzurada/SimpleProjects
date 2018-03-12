package animals.simple.animals;

public class Sheep extends Animal implements Dairy {
    public Sheep(double weight) {
        super(weight);
    }

    public int getMilk() {
        return 16;
    }

    public void talk() {
        System.out.println("Beeee!!");
    }
}
