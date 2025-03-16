package ex_02_Java_Basic_P2;

public class Lab021_Constantvalue {
    public static void main(String[] args) {
        final int a = 10;
        // a = 12; //    a = 12; not possible to change the value as we have used final before the variable

        final float PI = 3.14f;

//        PI=90;same for float varibale
//        Constant is something which value we can't change
//        If we try then will get,error as java: cannot assign a value to final variable PI
        System.out.println(PI);
    }}