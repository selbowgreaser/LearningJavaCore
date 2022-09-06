/**
 * <h1>Целочисленные типы</h1>
 */

public class LearningIntType {
    public static void main(String[] args) {
        int year = 100;
        int count = leapYearCount(year);
        System.out.println(count);
        int value = 0;
        int bitIndex = 1;
        int res = flipBit(value, bitIndex);
        System.out.println(res);
    }

    public static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }

    public static int flipBit(int value, int bitIndex) {
        return (int) Math.pow(2, bitIndex - 1) ^ value;
    }

}
