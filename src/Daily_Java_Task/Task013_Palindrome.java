package Daily_Java_Task;

import java.util.Scanner;

public class Task013_Palindrome {
    public static void main(String[] args) {
        String s= "Madam";
        System.out.println(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()) ? "Palindrome" : "Not a Palindrome");
    }
}
