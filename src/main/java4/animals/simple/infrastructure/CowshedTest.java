package animals.simple.infrastructure;

public class CowshedTest {
    public static void main(String[] args) {
        Cowshed cowshed = new Cowshed();
        System.out.println("Total milk: " + cowshed.getTotalMilk());
    }
}
