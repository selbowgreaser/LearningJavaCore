public class PowerOfTwo {
    public static void main(String[] args) {
        int value = -2;
        boolean result = isPowerOfTwo(value);
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
