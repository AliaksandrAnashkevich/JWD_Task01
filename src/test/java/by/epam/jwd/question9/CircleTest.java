package by.epam.jwd.question9;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private static final double DELTA = 0.01;

    @Test
    public void area() {
        double extend = 3.14;
        double actual = Circle.area(1);
        assertEquals(extend,actual,DELTA);
    }

    @Test
    public void circumference() {
        double extend = 6.28;
        double actual = Circle.circumference(1);
        assertEquals(extend,actual,DELTA);
    }
}