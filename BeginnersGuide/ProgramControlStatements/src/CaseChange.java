import java.io.IOException;

public class CaseChange {
    public static void main(String[] args) throws IOException {
        int intSymbol;
        char symbol;
        char ignore;
        int numberOfChanges = 0;

        do {
            intSymbol = System.in.read();
            if (65 <= intSymbol && intSymbol <= 90) {
                numberOfChanges++;
                symbol = (char) (intSymbol + 32);
                System.out.println(symbol);
            } else if (97 <= intSymbol && intSymbol <= 122) {
                numberOfChanges++;
                symbol = (char) (intSymbol - 32);
                System.out.println(symbol);
            } else System.out.println((char) intSymbol);

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (intSymbol != '.');
        System.out.println(numberOfChanges);
    }
}
