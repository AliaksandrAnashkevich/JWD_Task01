package by.epam.jwd.question4;

public class Number {

    public static boolean isTwoEwenNumber(int numberA, int numberB, int numberC, int numberD) {
        int count = 0;
        if (numberA % 2 == 0) {
            count++;
        }
        if (numberB % 2 == 0) {
            count++;
        }
        if (numberC % 2 == 0) {
            count++;
        }
        if (numberD % 2 == 0) {
            count++;
        }
        return count >= 2;
    }
}
