import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 100;

        System.out.println(findPrimeNumbers(n));
    }

    private static List findPrimeNumbers(int n) {
        boolean[] isPrimeNumber = new boolean[n];
        Arrays.fill(isPrimeNumber, true);
        for (int i = 2; i * i < n; i++) {
            if (isPrimeNumber[i]) {
                for (int j = i; i * j < n; j++) {
                    isPrimeNumber[i * j] = false;
                }
            }
        }
        List primeNumbers = new ArrayList();
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
