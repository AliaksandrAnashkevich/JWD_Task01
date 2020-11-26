package by.epam.jwd.question7;

public class Coordinate {

    public static char distanceToStart(double x1, double y1, double x2, double y2) {
        double r1 = Math.sqrt((x1 * x1) + (y1 * y1));
        double r2 = Math.sqrt((x2 * x2) + (y2 * y2));
        if (r1 < r2) {
            return 'A';
        } else {
            return 'B';
        }
    }
}
