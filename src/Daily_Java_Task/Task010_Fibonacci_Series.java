package Daily_Java_Task;

public class Task010_Fibonacci_Series {
    public static void main(String[] args) {
        int n = 12; // Number of terms
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a+ " ");
            int c= a + b;
            a = b;
            b = c;
            /*Applications:

Used in mathematics and computer algorithms (recursion & dynamic programming).

Appears in nature, such as the arrangement of leaves, flowers, and shells (Golden Ratio).

Used in finance and stock market predictions.*/
        }
    }
}