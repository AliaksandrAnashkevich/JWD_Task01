package by.epam.jwd.question2;

public class Date {
    private static final String[] ARRAY_WITH_NAME_MONTH = {"January","February","March","April",
                                                            "May","June","July","August","September","October",
                                                            "November","December"};

    public static boolean isLeapYear(int numberYear) {

        return ((numberYear % 400 == 0) || ((numberYear % 4 == 0) && (numberYear % 100 != 0)));
    }

    public static String nameMonth(int numberMonth) {

        return ((numberMonth<13)&&(numberMonth>0))?ARRAY_WITH_NAME_MONTH[numberMonth-1]:"error";
    }

}