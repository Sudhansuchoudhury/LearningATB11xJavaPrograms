package Daily_Java_Task;

public class Task004_Increment_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        /* ++a-> ExpA-> 11 a->11
         * a++-> ExpB-> 11 a->12
         * a++-> ExpC-> 12 a->13
         * 6->> 11+11+12=34
         * 7->> 13
         */




    }
}
