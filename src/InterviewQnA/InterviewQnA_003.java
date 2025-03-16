package InterviewQnA;

public class InterviewQnA_003 {
    public static void main(String[] args) {
        String first_name = "X";
        String last_name = "Y";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // As JVM will read the code from left to right it will check the 1st operator
        // If it found the 1st operator as String then it will action on rest of values as String value only
        //XY1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        //In this case JVM will read the starting value as integer and it will show result as 20XY

        System.out.println(first_name + last_name + (a + b));
        //If we add Bracket before any Int value the JVM will check and act as per need/
        // In above case the value will be XY20

    }
}
