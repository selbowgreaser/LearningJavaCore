public class WhereAmIFrom {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
        doubleAnotherMethod();
    }

    private static void doubleAnotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stack = new Throwable().getStackTrace();
        if (stack.length < 3) {
            return null;
        }
        StackTraceElement element = stack[2];
        return element.getClassName() + "#" + element.getMethodName();
    }
}
