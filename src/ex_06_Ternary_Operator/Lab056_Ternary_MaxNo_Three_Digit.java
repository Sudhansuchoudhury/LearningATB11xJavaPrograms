package ex_06_Ternary_Operator;

public class Lab056_Ternary_MaxNo_Three_Digit {
    public static void main(String[] args) {
    int a=100;
    int b=125;
    int c=28;
    String result=(a>b)?(a>c)?"a":"b":((b>c)?"b":"c");
        System.out.println(result);
}
}
