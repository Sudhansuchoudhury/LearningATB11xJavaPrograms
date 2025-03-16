package ex_04_Operaters;

public class Lab035_Unary_Operator {
    public static void main(String[] args) {
        // Unary Operator
        int a = +10;
        int a1 = -110;
        int result = a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);


        int b = -1;
        b = b+1;
        System.out.println(b);  //It's result will be 0
    }
}
