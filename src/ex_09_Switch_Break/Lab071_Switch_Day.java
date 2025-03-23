package ex_09_Switch_Break;

import java.util.Scanner;

public class Lab071_Switch_Day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to find the Day");
        int Day= sc.nextInt();
        switch (Day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
                break;
            // Switch

            // Take a user input and tell them the day which they have told.
            // 1 to 7 -> 1 -> mon, 5 -> fri
            // 8 ? - Not allowed or error

            //int day = Integer.parseInt(args[0]); - CLI option
        }
    }
}
