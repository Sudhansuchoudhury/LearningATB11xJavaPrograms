package ex_04_Operaters;

public class Lab034_Operators_Arithmetic_Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder

        int a = 20;
        int b = 3;
        float c = 3.0f;
        double d = 3.0;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c); // 6.666665
        System.out.println(a/d); // 6.666666666666667
        /*If we use Int value then the result will be in single digit like here it will show only 6
        *If we use float/double then it will show the actual values
        */


        System.out.println("a+b");// It will show the bracket value as is
        System.out.println(a+b);// it will show the addition of a+b variable value

    }
}
