package Java4easy1.animals;

public abstract class Animal {
    private double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public abstract void talk();
}
