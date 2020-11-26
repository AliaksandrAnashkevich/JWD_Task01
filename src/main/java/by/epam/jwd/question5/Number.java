package by.epam.jwd.question5;

public class Number {
    public static boolean isPerfectNumber(int number) {
        int count = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count += i;
            }
        }
        return count == number;
    }
}
