package ex_05_TypeCasting;

public class Lab048_Explicit_Casting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Invalid - Narrowing - Implicit Casting is not allowed.
        byte b2 = (byte) val; // Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.
        System.out.println(b2);
/*IT will check convert the decimal number to binary number and calculate as
      *Here 300 binary value is 0000000100101100
      * As we used byt value it will consider numbers from right to left
      * It will consider l the number as 00101100
      * Then it will calculate the final result like
      *
      * For sampling 200= 11001000 (Always if the 1st number is 1 then it will be Count as -1
      * (-1 ×(2*2*2*2*2*2*2)) + (1 × (2*2*2*2*2*2)) + (0 × (2*2*2*2*2))+(0 × (2*2*2*2))+(1 × (2*2*2)) +(0 × (2*2))+(0 × (2*1))+ (0 × 2)
 */
    }
}