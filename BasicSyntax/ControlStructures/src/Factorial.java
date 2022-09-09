import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        BigInteger result = factorial(n);
        System.out.println(result);
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
