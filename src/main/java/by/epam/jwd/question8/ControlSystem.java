package by.epam.jwd.question8;

public class ControlSystem {
    public static void main(String[] args) {
        System.out.println(function(-1));
        System.out.println(function(3));
        System.out.println(function(4));
    }
    private static double function1(double x) {
        return -(x * x) + (3 * x) + 9;
    }

    private static double function2(double x) {
        return 1 / ((x * x * x) + 6);
    }

    public static double function(double x) {
        return x >= 3 ? function1(x) : function2(x);
    }
}
