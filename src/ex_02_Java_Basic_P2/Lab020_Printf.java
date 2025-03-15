package ex_02_Java_Basic_P2;

public class Lab020_Printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("You variable is %d",a);
        /*In this case int a will replace the value of a and the value of a will replace %d
        If we replace "a" with (a*3) then the final value will be Int a replaced "a" as 10*3, then it will replace the %d value with 30
         */

        // %d used for -> int, byte, long, short, - data type
        // %s used for -> String
        // %f used for -> float, double,
        // %b used for ->boolean
        int b = 20;
        System.out.println( " ");
        System.out.printf("%d + %d",a,b);
        System.out.println( " ");
        System.out.printf("%d + %d=%d",a,b,a+b);
        System.out.println( " ");
        System.out.printf("%d - %d=%d",b,a,b-a);
        System.out.println( " ");
        System.out.printf("%d * %d=%d",b,a,b*a);
        System.out.println( " ");
        System.out.printf("%d / %d=%d",b,a,b/a);

    }
}
