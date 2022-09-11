import java.io.IOException;

public class WhileDontDot {
    public static void main(String[] args) throws IOException {
        char symbol;
        char ignore;
        int countSpace = 0;

        do {
            System.out.println("Введите какой-нибудь символ. Для выхода введите '.'");
            symbol = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (symbol == ' ') {
                countSpace++;
            }
        } while (symbol != '.');

        System.out.println("Количество пробелов = " + countSpace);
    }
}
