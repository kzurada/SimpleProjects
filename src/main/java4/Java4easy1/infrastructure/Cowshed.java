package Java4easy1.infrastructure;


import Java4easy1.animals.*;

import java.util.Random;

public class Cowshed {
    private Animal[] animals;
    private static final int NUMBER_OF_ANIMALS = 15;

    public Cowshed() {
        this.animals = new Animal[NUMBER_OF_ANIMALS];
        populateCowshed();
        printCowshed();
    }

    private void populateCowshed() {
        // Tworzymy losowe zwierzęta z losową wagą (każde zwierzę ma jakąś wagę)
        Random random = new Random();
        for (int i = 0; i < NUMBER_OF_ANIMALS; i++) {
            int randomInt = random.nextInt(5);
            switch (randomInt) {
                case 0:
                    this.animals[i] = new Cow(random.nextDouble() * 100);
                    break;
                case 1:
                    this.animals[i] = new Goat(random.nextDouble() * 80);
                    break;
                case 2:
                    this.animals[i] = new Sheep(random.nextDouble() * 50);
                    break;
                case 3:
                    this.animals[i] = new Hen(random.nextDouble() * 10);
                    break;
                case 4:
                    this.animals[i] = new Pig(random.nextDouble() * 60);
                    break;
            }
        }
    }

    private void printCowshed() {
        for (Animal animal : this.animals) {
            animal.talk();
        }
    }

    public int getTotalMilk() {
        int result = 0;
        // sprawdzamy każde zwierzę w oborze
        for (Animal animal : this.animals) {
            // sprawdzamy czy zwierzę jest mleczne
            if (animal instanceof Dairy) {
                // jak jest mleczne, to rzutujemy na Dairy, żeby można było użyć metody getMilk()
                result += ((Dairy)animal).getMilk();
            }
        }
        return result;
    }
}
