package ex_07_Increment_Decrement_Operator;

public class Lab060_POST_ID {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);
        System.out.println(a);

        // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++); // 10 , a  = 11
        System.out.println(a_post);
    }
}
