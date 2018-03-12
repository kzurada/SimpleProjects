package cars.simple.cars;

public class Factory {
    public Car createCar(String model, String color, int numberOfDoors) {
        if (model.equals("Mazda")) {
            return new Mazda(color, numberOfDoors);
        } else if (model.equals("BMW")) {
            return new Bmw(color, numberOfDoors);
        } else if (model.equals("Ferrari")) {
            return new Ferrari(color, numberOfDoors);
        }
        return null;
    }
}
