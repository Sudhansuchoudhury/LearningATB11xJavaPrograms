package ex_01_Java_Basics;

public class Lab012_BasicArithmetic {
    public static void main(String[] args) {
        int X = 10, Y = 10, Z = 10;

              // Using Math functions
        System.out.println("Square root of X: " + Math.sqrt(X));
        System.out.println("X raised to the power of Y: " + Math.pow(X, Y));
        System.out.println("Absolute value of -15: " + Math.abs(-15));
        System.out.println("Max of X, Y, Z: " + X);

        // A Complex Formula
        double result = Math.sqrt(X) + Math.pow(Y, 2) - Math.abs(Z);
        System.out.println("Result of formula: " + result);

    }
}
