package by.epam.jwd.question3;

public class Square {

    public static double areaInscribedSquare(double areaDescribedSquare){
        return areaDescribedSquare/2;
    }

    public static double areaRation(double areaInscribedSquare, double areaDescribedSquare){
        return areaDescribedSquare/areaInscribedSquare;
    }
}
