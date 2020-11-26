package by.epam.jwd.question2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void isLeapYear1() {
        boolean actual = Date.isLeapYear(400);
        assertTrue(actual);
    }

    @Test
    public void isLeapYear2() {
        boolean actual = Date.isLeapYear(401);
        assertFalse(actual);
    }

    @Test
    public void nameMonth1() {
        String extend = "May";
        String actual = Date.nameMonth(5);
        assertEquals(extend,actual);
    }

    @Test
    public void nameMonth2() {
        String extend = "error";
        String actual = Date.nameMonth(20);
        assertEquals(extend,actual);
    }
}