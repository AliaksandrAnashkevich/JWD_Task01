package by.epam.jwd.question1;

import org.junit.Assert;
import org.junit.Test;

public class LastNumeralTest {

    @Test
    public void testSqrForLastNumeral() {
        int extend = 6;
        int actual = LastNumeral.sqrForLastNumeral(4);
        Assert.assertEquals(extend,actual);
    }
}