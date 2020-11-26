package by.epam.jwd.question3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    private static final double DELTA = 0.001;

    @Test
    public void areaInscribedSquare() {
        double extend= 2;
        double actual=Square.areaInscribedSquare(4);
        assertEquals(extend,actual,DELTA);
    }

    @Test
    public void areaRation() {
        double extend = 2;
        double actual = Square.areaRation(2,4);
        assertEquals(extend,actual,DELTA);
    }
}