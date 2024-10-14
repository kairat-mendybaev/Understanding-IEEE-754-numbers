public class IEEE754Converter {

    public static String toIEEE754(float number) {
        int bits = Float.floatToIntBits(number);  // Converts float to IEEE 754 bits
        return String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
    }

    public static void main(String[] args) {
        float number = 10.5f;
        String ieee754 = toIEEE754(number);
        System.out.println("IEEE 754 representation of " + number + " is: " + ieee754);
    }
}
