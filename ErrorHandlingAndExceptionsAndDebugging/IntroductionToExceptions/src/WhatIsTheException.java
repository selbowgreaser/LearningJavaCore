public class WhatIsTheException {
    public static void main(String[] args) {
        B b = new B();
        A a = (A) b;
    }

    public static class A extends B {
        int lol = 10;
    }

    public static class B {
        int kek = 20;
    }
}
