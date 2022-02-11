package day_2;

public class Calculator {
    public static void main(String[] args) {
        //Task 1. Implement a simple calculator with 4 operations.
        //Each operation - different method. Use it in the main method.

        double a = -2.66;
        double b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("-----operations-----");
        System.out.println("a + b = " + add(a,b));
        System.out.println("a - b = " + minus(a,b));
        System.out.println("a * b = " + multiply(a,b));
        System.out.println("a / b = " + divide(a,b));
    }

    private static double divide(double a, double b) {
        return a/b;
    }

    private static double multiply(double a, double b) {
        return a*b;
    }

    private static double minus(double a, double b) {
        return a-b;
    }

    private static double add(double a, double b) {
        return a+b;
    }
}
