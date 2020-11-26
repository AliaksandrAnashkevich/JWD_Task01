package by.epam.jwd.question8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControlSystemTest {
    private static final double DELTA = 0.01;

    @Test
    public void function1() {
        double extend = 0.2;
        double actual = ControlSystem.function(-1);
        assertEquals(extend, actual, DELTA);
    }

    @Test
    public void function2() {
        double extend = 9.0;
        double actual = ControlSystem.function(3);
        assertEquals(extend, actual, DELTA);
    }

    @Test
    public void function3() {
        double extend = 5.0;
        double actual = ControlSystem.function(4);
        assertEquals(extend, actual, DELTA);
    }
}