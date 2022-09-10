public class LogicalOpTable {
    public static void main(String[] args) {
        boolean a;
        boolean b;

        System.out.print("a\tb\tAND\tOR\tXOR\tNOT\n");
        a = false;
        b = false;
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", a ? 1 : 0, b ? 1 : 0, a && b ? 1 : 0, a || b ? 1 : 0, a ^ b ? 1 : 0, !a ? 1 : 0);
        a = false;
        b = true;
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", a ? 1 : 0, b ? 1 : 0, a && b ? 1 : 0, a || b ? 1 : 0, a ^ b ? 1 : 0, !a ? 1 : 0);
        a = true;
        b = false;
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", a ? 1 : 0, b ? 1 : 0, a && b ? 1 : 0, a || b ? 1 : 0, a ^ b ? 1 : 0, !a ? 1 : 0);
        a = true;
        b = true;
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", a ? 1 : 0, b ? 1 : 0, a && b ? 1 : 0, a || b ? 1 : 0, a ^ b ? 1 : 0, !a ? 1 : 0);
    }
}
