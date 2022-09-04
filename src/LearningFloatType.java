import java.math.*;

public class LearningFloatType {
    public static void main(String[] args) {
        double a, b, c;
        a = 0.1;
        b = 0.2;
        c = 0.3;
        boolean res = doubleExpression(a, b, c);
        System.out.println(res);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 1e-4;
    }

}
