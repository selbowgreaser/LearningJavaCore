public class LogicalOpTable {
    public static void main(String[] args) {
        boolean a, b;

        System.out.printf("a\tb\tAND\tOR\tXOR\tNOT\t\n");
        a = false;
        b = false;
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t\n", a ? 1 : 0, b ? 1 : 0, a && b ? 1 : 0, a || b ? 1 : 0, a ^ b ? 1 : 0, !a ? 1 : 0);
        a = false;
        b = true;
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t\n", a ? 1 : 0, b ? 1 : 0, a && b ? 1 : 0, a || b ? 1 : 0, a ^ b ? 1 : 0, !a ? 1 : 0);
        a = true;
        b = false;
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t\n", a ? 1 : 0, b ? 1 : 0, a && b ? 1 : 0, a || b ? 1 : 0, a ^ b ? 1 : 0, !a ? 1 : 0);
        a = true;
        b = true;
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t\n", a ? 1 : 0, b ? 1 : 0, a && b ? 1 : 0, a || b ? 1 : 0, a ^ b ? 1 : 0, !a ? 1 : 0);
    }
}
