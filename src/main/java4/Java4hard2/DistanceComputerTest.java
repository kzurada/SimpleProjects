package Java4hard2;

public class DistanceComputerTest {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0, 3.0);
        Point p2 = new Point(2.3, 4.5, 0.5);
        Point p3 = new Point(9.8, 3.4, 2.5);
        Point p4 = new Point(10.2, 3.2, 1.5);

        System.out.println("Odległość między punktami:");
        System.out.println("Metryka euklidesowa: " + DistanceComputer.computeEuclideanDistance(p1, p2, p3, p4));
        System.out.println("Metryka taksówkowa: " + DistanceComputer.computeTaxicabDistance(p1, p2, p3, p4));
        System.out.println("Metryka Czebyszewa: " + DistanceComputer.computeChebyshevDistance(p1, p2, p3, p4));
    }
}
