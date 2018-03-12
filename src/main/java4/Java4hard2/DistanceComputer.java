package Java4hard2;

public class DistanceComputer {
    public static double computeEuclideanDistance(Point... points) {
        double dist = 0;
        for (int i = 0; i < points.length - 1; i++) {
            dist += Math.sqrt(Math.pow(points[i].getX() - points[i+1].getX(), 2)
                    + Math.pow(points[i].getY() - points[i+1].getY(), 2)
                    + Math.pow(points[i].getZ() - points[i+1].getZ(), 2));
        }
        return dist;
    }

    public static double computeTaxicabDistance(Point... points) {
        double dist = 0;
        for (int i = 0; i < points.length - 1; i++) {
            dist += Math.abs(points[i].getX() - points[i+1].getX())
                    + Math.abs(points[i].getY() - points[i+1].getY())
                    + Math.abs(points[i].getZ() - points[i+1].getZ());
        }
        return dist;
    }

    public static double computeChebyshevDistance(Point... points) {
        double dist = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double max1 = Math.max(Math.abs(points[i].getX() - points[i+1].getX()),
                    Math.abs(points[i].getY() - points[i+1].getY()));
            dist += Math.max(max1, Math.abs(points[i].getZ() - points[i+1].getZ()));
        }
        return dist;
    }
}
