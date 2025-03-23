package ex_07_Increment_Decrement_Operator;

public class Lab058_Increment_decrement_op {
    public static void main(String[] args) {
        // Take inputs
        String age1 = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];
       // String a4 = args[4];
        //java.lang.ArrayIndexOutOfBoundsException error will be populated if we run the code with argument without any input
        int age = Integer.parseInt(age1);
        System.out.println(age);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
