import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingModes {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("2.555");

        // Using different rounding modes
        System.out.println("ROUND_HALF_UP: " + number.setScale(2, RoundingMode.HALF_UP));   // Rounds to 2.56
        System.out.println("ROUND_HALF_DOWN: " + number.setScale(2, RoundingMode.HALF_DOWN)); // Rounds to 2.55
        System.out.println("ROUND_FLOOR: " + number.setScale(2, RoundingMode.FLOOR));   // Rounds down to 2.55
    }
}
