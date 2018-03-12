package animals.simple.animals;

public class Hen extends Animal {
    public Hen(double weight) {
        super(weight);
    }

    public void talk() {
        System.out.println("Ko! Ko! Ko!");
    }
}
