package ex_05_TypeCasting;

public class Lab049_BothCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit is not possible
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
}}
