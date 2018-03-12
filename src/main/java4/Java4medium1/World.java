package Java4medium1;


import Java4medium1.cars.Factory;

public class World {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Client client = new Client();
        client.setCar(factory.createCar("Mazda", "red", 5));
    }
}
