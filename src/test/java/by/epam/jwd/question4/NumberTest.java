package by.epam.jwd.question4;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void isTwoEwenNumber1() {
        boolean actual=Number.isTwoEwenNumber(0,1,2,4);
        assertTrue(actual);
    }

    @Test
    public void isTwoEwenNumber2() {
        boolean actual=Number.isTwoEwenNumber(5,1,3,4);
        assertFalse(actual);
    }
}