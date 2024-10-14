import org.junit.Test;
import static org.junit.Assert.*;

public class SpecialValuesTest {

    @Test
    public void testPositiveInfinity() {
        float positiveInfinity = 1.0f / 0.0f;

        assertTrue("Value should be positive infinity", Float.isInfinite(positiveInfinity));
        assertTrue("Value should be positive", positiveInfinity > 0);
    }

    @Test
    public void testNegativeInfinity() {
        float negativeInfinity = -1.0f / 0.0f;

        assertTrue("Value should be negative infinity", Float.isInfinite(negativeInfinity));
        assertTrue("Value should be negative", negativeInfinity < 0);
    }

    @Test
    public void testNaN() {
        float nan = 0.0f / 0.0f;

        assertTrue("Value should be NaN", Float.isNaN(nan));
        assertTrue("NaN should not be equal to itself", nan != nan);  // Verifying NaN's special property
    }
}
