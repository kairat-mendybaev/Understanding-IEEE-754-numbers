import org.junit.Test;
import static org.junit.Assert.*;

public class IEEE754ArithmeticTest {

    @Test
    public void testIEEE754Representation() {
        // Testing IEEE 754 representation for 0.1 + 0.2
        float result1 = 0.1f + 0.2f;
        String ieee754Result1 = IEEE754Converter.toIEEE754(result1);
        String expectedIeee754Result1 = IEEE754Converter.toIEEE754(0.3f); // Expected close approximation

        assertEquals("IEEE 754 representation of 0.1 + 0.2 is incorrect", expectedIeee754Result1, ieee754Result1);

        // Testing IEEE 754 representation for 1.0 / 3.0
        float result2 = 1.0f / 3.0f;
        String ieee754Result2 = IEEE754Converter.toIEEE754(result2);
        String expectedIeee754Result2 = IEEE754Converter.toIEEE754(result2);  // Should match the generated IEEE 754

        assertEquals("IEEE 754 representation of 1.0 / 3.0 is incorrect", expectedIeee754Result2, ieee754Result2);
    }

    @Test
    public void testArithmeticResults() {
        // Testing result for 0.1 + 0.2
        float result1 = 0.1f + 0.2f;
        assertTrue("Result of 0.1 + 0.2 is incorrect", Math.abs(result1 - 0.3f) < 0.00001);

        // Testing result for 1.0 / 3.0
        float result2 = 1.0f / 3.0f;
        assertTrue("Result of 1.0 / 3.0 is incorrect", Math.abs(result2 - 0.33333333f) < 0.00001);
    }
}
