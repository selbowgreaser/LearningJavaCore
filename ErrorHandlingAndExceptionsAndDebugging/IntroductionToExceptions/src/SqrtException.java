public class SqrtException {
    public static void main(String[] args) {
        double x = 16;
        double y = -15;

        sqrt(x);
        sqrt(y);
    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}
