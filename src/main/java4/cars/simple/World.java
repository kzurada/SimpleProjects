package cars.simple;


import cars.simple.cars.Factory;

public class World {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Client client = new Client();
        client.setCar(factory.createCar("Mazda", "red", 5));
    }
}
