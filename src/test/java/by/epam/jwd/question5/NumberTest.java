package by.epam.jwd.question5;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void isPerfectNumber1() {
        boolean actual=Number.isPerfectNumber(6);
        assertTrue(actual);
    }

    @Test
    public void isPerfectNumber2() {
        boolean actual=Number.isPerfectNumber(10);
        assertFalse(actual);
    }
}