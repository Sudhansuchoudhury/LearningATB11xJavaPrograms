package ex_04_Operaters;

public class Lab038_Logical_NOT_operator {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a); // here a value is true, if we use Not operator (!), then here the result will show the false
        boolean b = true;
        System.out.println(!!b);
/*here Not operator used twice that means
b value is true
in 1st Not operator the value will be changed to false
then again using Not operator will change the value of b into true
 */

    }
}
