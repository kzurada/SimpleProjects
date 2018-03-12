package Java4medium1.cars;

public abstract class Car {
    private final String model;
    private String color;
    private final int numberOfDoors;

    protected Car(String model, String color, int numberOfDoors) {
        this.model = model;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }
}
