package by.epam.jwd.question10;

import org.junit.Test;
import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class TangentTest {
    private static final double DELTA = 0.001;

    @Test
    public void table() {
        double[] extend = {0, 0, 0};
        Double[] actualDouble = Tangent.table(0, 2 * Math.PI, Math.PI).values().toArray(new Double[3]);
        double[] actual = Stream.of(actualDouble)
                                .mapToDouble(Double::doubleValue)
                                .toArray();
        assertArrayEquals(extend, actual, DELTA);
    }
}