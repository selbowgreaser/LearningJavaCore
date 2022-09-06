public class CharToIntToChar {
    public static void main(String[] args) {
        int a = 32;
        char result = charExpression(a);
        System.out.println(result);
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
