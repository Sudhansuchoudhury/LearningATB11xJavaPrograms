package Daily_Java_Task;

import java.util.Scanner;

public class Task003_GradewithScanerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Score");
        int score = sc.nextInt();
        String Grade;
        if (score>=90 && score<=100) {
            Grade = "A";
        } else if (score>=80 && score<=89) {
            Grade = "B";
        }else if (score>=70 && score<=79) {
            Grade = "C";
        }else if (score>=60 && score<=69) {
            Grade = "D";
        }else if (score>=0 && score<=59) {
            Grade = "F";
        }else {
            Grade= "Invalid Score. Please Enter a Valid Number to Check your Grade";
        }
        System.out.println("Your Grade is: " + Grade);
        sc.close();
    }
    }