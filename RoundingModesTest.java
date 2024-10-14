import org.junit.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static org.junit.Assert.*;

public class RoundingModesTest {

    @Test
    public void testRoundHalfUp() {
        BigDecimal number = new BigDecimal("2.555");
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        BigDecimal expected = new BigDecimal("2.56");

        assertEquals("Rounding HALF_UP is incorrect", expected, rounded);
    }

    @Test
    public void testRoundHalfDown() {
        BigDecimal number = new BigDecimal("2.555");
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal expected = new BigDecimal("2.55");

        assertEquals("Rounding HALF_DOWN is incorrect", expected, rounded);
    }

    @Test
    public void testRoundFloor() {
        BigDecimal number = new BigDecimal("2.555");
        BigDecimal rounded = number.setScale(2, RoundingMode.FLOOR);
        BigDecimal expected = new BigDecimal("2.55");

        assertEquals("Rounding FLOOR is incorrect", expected, rounded);
    }
}
