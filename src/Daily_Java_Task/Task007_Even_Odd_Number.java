package Daily_Java_Task;

import java.util.Scanner;

public class Task007_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num= sn.nextInt();
        if (num%2==0){
            System.out.println("Even Number");}
        else {
            System.out.println("Odd Number");
            sn.close();

            }
        }
    }
