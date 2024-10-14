public class IEEE754Arithmetic {

    public static void main(String[] args) {
        float result1 = 0.1f + 0.2f;
        float result2 = 1.0f / 3.0f;

        System.out.println("0.1 + 0.2 in IEEE 754: " + IEEE754Converter.toIEEE754(result1));
        System.out.println("1.0 / 3.0 in IEEE 754: " + IEEE754Converter.toIEEE754(result2));

        System.out.println("0.1 + 0.2 result: " + result1);
        System.out.println("1.0 / 3.0 result: " + result2);
    }
}
