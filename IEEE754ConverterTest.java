import org.junit.Test;
import static org.junit.Assert.*;

public class IEEE754ConverterTest {

    @Test
    public void testPositiveNumber() {
        // Test case for a positive number (10.5f)
        float number = 10.5f;
        String ieee754 = IEEE754Converter.toIEEE754(number);
        String expected = "01000001001010000000000000000000";  // Pre-calculated IEEE 754 representation

        assertEquals("IEEE 754 representation of 10.5 is incorrect", expected, ieee754);
    }

    @Test
    public void testNegativeNumber() {
        // Test case for a negative number (-5.75f)
        float number = -5.75f;
        String ieee754 = IEEE754Converter.toIEEE754(number);
        String expected = "11000000101110000000000000000000";  // Pre-calculated IEEE 754 representation

        assertEquals("IEEE 754 representation of -5.75 is incorrect", expected, ieee754);
    }

    @Test
    public void testZero() {
        // Test case for zero (0.0f)
        float number = 0.0f;
        String ieee754 = IEEE754Converter.toIEEE754(number);
        String expected = "00000000000000000000000000000000";  // IEEE 754 representation of 0.0

        assertEquals("IEEE 754 representation of 0.0 is incorrect", expected, ieee754);
    }

    @Test
    public void testPositiveInfinity() {
        // Test case for positive infinity
        float number = Float.POSITIVE_INFINITY;
        String ieee754 = IEEE754Converter.toIEEE754(number);
        String expected = "01111111100000000000000000000000";  // IEEE 754 representation of positive infinity

        assertEquals("IEEE 754 representation of positive infinity is incorrect", expected, ieee754);
    }

    @Test
    public void testNegativeInfinity() {
        // Test case for negative infinity
        float number = Float.NEGATIVE_INFINITY;
        String ieee754 = IEEE754Converter.toIEEE754(number);
        String expected = "11111111100000000000000000000000";  // IEEE 754 representation of negative infinity

        assertEquals("IEEE 754 representation of negative infinity is incorrect", expected, ieee754);
    }

    @Test
    public void testNaN() {
        // Test case for NaN (Not a Number)
        float number = Float.NaN;
        String ieee754 = IEEE754Converter.toIEEE754(number);
        String expected = "01111111110000000000000000000000";  // IEEE 754 representation of NaN (one of the possible forms)

        assertEquals("IEEE 754 representation of NaN is incorrect", expected, ieee754);
    }
}
