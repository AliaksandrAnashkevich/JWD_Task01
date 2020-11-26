package by.epam.jwd.question7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateTest {

    @Test
    public void distanceToStart() {
        char extend = 'A';
        char actual = Coordinate.distanceToStart(-1, -1, 2, 2);
        assertEquals(extend,actual);
    }
}