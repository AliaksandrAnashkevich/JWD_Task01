package by.epam.jwd.question6;

public class Time {
    public static int fullHour(int second) {
        second %= 86400;
        return second / 3600;
    }

    public static int fullMinutes(int second) {
        second %= 86400;
        return second / 60;
    }

    public static int fullSecond(int second) {
        return second % 86400;
    }
}
