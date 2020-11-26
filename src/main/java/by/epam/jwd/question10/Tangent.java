package by.epam.jwd.question10;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tangent {

    public static Map<Double, Double> table(double a, double b, double h) {
        Map<Double, Double> table = new LinkedHashMap();
        while (a <= b) {
            table.put(a, Math.tan(a));
            a += h;
        }
        return table;
    }
}
