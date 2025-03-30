package Daily_Java_Task;
import java.util.Scanner;
public class Task009_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int S1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int S2=sc.nextInt();
        System.out.println("Enter 3rd Number");
        int S3=sc.nextInt();

        if (S1==S2 && S2==S3) {
            System.out.println("The triangle is equilateral");
        }
        else if(S1==S2 || S2==S3 ||S1==S3) {
            System.out.println("The triangle is Isosceles.");
        }
        else {System.out.println("The triangle is Scalene.");}
        sc.close();
        }

    }