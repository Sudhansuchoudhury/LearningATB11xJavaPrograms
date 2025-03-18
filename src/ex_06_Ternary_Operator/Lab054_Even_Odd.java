package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab054_Even_Odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=3;
        String result= (a%2==0)? "This is a Even number": "This is Odd number";
        System.out.println(result);

    }
}
