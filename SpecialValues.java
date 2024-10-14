public class SpecialValues {
    public static void main(String[] args) {
        float positiveInfinity = 1.0f / 0.0f;
        float negativeInfinity = -1.0f / 0.0f;
        float nan = 0.0f / 0.0f;

        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);
        System.out.println("NaN: " + nan);

        // Check NaN property (NaN is not equal to itself)
        System.out.println("Is NaN not equal to itself? " + (nan != nan));  // Should print true
    }
}
