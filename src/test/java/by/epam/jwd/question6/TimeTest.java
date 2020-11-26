package by.epam.jwd.question6;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

    @Test
    public void fullHour() {
        int extend = 1;
        int actual = Time.fullHour(3601);
        assertEquals(extend, actual);
    }

    @Test
    public void fullMinutes() {
        int extend = 2;
        int actual = Time.fullMinutes(121);
        assertEquals(extend, actual);
    }

    @Test
    public void fullSecond() {
        int extend = 3600;
        int actual = Time.fullSecond(3600);
        assertEquals(extend, actual);
    }
}